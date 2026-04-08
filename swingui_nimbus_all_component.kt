import javax.swing.UIManager
import javax.swing.UIManager.LookAndFeelInfo
import java.awt.*
import javax.swing.*
import javax.swing.border.TitledBorder

fun setupNimbus() {
    try {
        for (info in UIManager.getInstalledLookAndFeels()) {
            if ("Nimbus" == info.name) {
                UIManager.setLookAndFeel(info.className)
                break
            }
        }
    } catch (e: Exception) {
        // Fallback to System Look and Feel if Nimbus isn't found
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName())
        UIManager.put("nimbusBase", Color(142, 68, 173))
        UIManager.put("nimbusBlueGrey", Color(190, 144, 212))
// Call this BEFORE setting the LookAndFeel
    }
}


class NimbusShowcase : JFrame("Nimbus Design - Kotlin") {
    init {
        title = "Nimbus UI Gallery"
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(500, 600)
        setLocationRelativeTo(null)

        // Main container with padding
        val root = JPanel(BorderLayout(10, 10)).apply {
            border = BorderFactory.createEmptyBorder(15, 15, 15, 15)
        }

        val gridPanel = JPanel(GridLayout(0, 1, 10, 10))

        // 1. Buttons & Toggles
        val btnPanel = JPanel(FlowLayout(FlowLayout.LEFT))
        btnPanel.border = TitledBorder("Buttons")
        btnPanel.add(JButton("Standard"))
        btnPanel.add(JButton("Default").apply { isDefaultCapable = true })
        btnPanel.add(JToggleButton("Toggle Me", true))
        gridPanel.add(btnPanel)

        // 2. Selection Components
        val selectPanel = JPanel(FlowLayout(FlowLayout.LEFT))
        selectPanel.border = TitledBorder("Selections")
        selectPanel.add(JCheckBox("Check", true))
        selectPanel.add(JRadioButton("Radio", true))
        selectPanel.add(JComboBox(arrayOf("Item 1", "Item 2", "Item 3")))
        gridPanel.add(selectPanel)

        // 3. Sliders and Progress
        val feedbackPanel = JPanel(GridLayout(2, 1, 5, 5))
        feedbackPanel.border = TitledBorder("Indicators")
        feedbackPanel.add(JSlider(0, 100, 45))
        feedbackPanel.add(JProgressBar().apply { 
            isStringPainted = true
            value = 65 
        })
        gridPanel.add(feedbackPanel)

        // 4. Text Components
        val textPanel = JPanel(BorderLayout(5, 5))
        textPanel.border = TitledBorder("Text Inputs")
        textPanel.add(JTextField("Editable text field"), BorderLayout.NORTH)
        textPanel.add(JScrollPane(JTextArea("Multi-line text area\nwith Nimbus styling.", 3, 20)))
        gridPanel.add(textPanel)

        root.add(gridPanel, BorderLayout.CENTER)
        add(root)
    }
}

fun main() {
    setupNimbus()
    SwingUtilities.invokeLater {
        NimbusShowcase().isVisible = true
    }
}
