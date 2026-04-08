import javax.swing.UIManager
import javax.swing.UIManager.LookAndFeelInfo
import java.awt.*
import javax.swing.*
import javax.swing.border.TitledBorder

class NimbusExample : JFrame("Kotlin Swing + Nimbus") {
    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(450, 400)
        setLocationRelativeTo(null)
        layout = BorderLayout(10, 10)

        // Main Container
        val panel = JPanel().apply {
            layout = GridLayout(0, 1, 10, 10)
            border = TitledBorder("Nimbus Component Suite")
        }

        // 1. Buttons
        val buttonPanel = JPanel()
        buttonPanel.add(JButton("Standard Button"))
        buttonPanel.add(JButton("Disabled").apply { isEnabled = false })
        panel.add(buttonPanel)

        // 2. Input Fields
        val inputPanel = JPanel()
        inputPanel.add(JTextField("Editable Text", 15))
        inputPanel.add(JCheckBox("Check Me", true))
        panel.add(inputPanel)

        // 3. Selection Components
        val selectPanel = JPanel()
        val options = arrayOf("Option A", "Option B", "Option C")
        selectPanel.add(JComboBox(options))
        selectPanel.add(JRadioButton("Radio Select"))
        panel.add(selectPanel)

        // 4. Progress and Feedback
        val feedbackPanel = JPanel(BorderLayout(5, 5))
        val progressBar = JProgressBar().apply {
            isStringPainted = true
            value = 75
        }
        val slider = JSlider(0, 100, 50)
        feedbackPanel.add(progressBar, BorderLayout.NORTH)
        feedbackPanel.add(slider, BorderLayout.SOUTH)
        panel.add(feedbackPanel)

        add(panel, BorderLayout.CENTER)
    }
}
fun main() {
    try {
        for (info in UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus" == info.name) {
                UIManager.setLookAndFeel(info.className)
                break
            }
        }
    } catch (e: Exception) {
        // If Nimbus is not available, fall back to default
        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName())
        //ket nimbus feature
        UIManager.put("nimbusBase", Color(0x336699)) // Changes the main theme color
        UIManager.put("nimbusBlueGrey", Color(0xCFD8DC)) // Changes borders and secondary surfaces
    }

    javax.swing.SwingUtilities.invokeLater {
        val frame = NimbusExample()
        frame.isVisible = true
    }
}
