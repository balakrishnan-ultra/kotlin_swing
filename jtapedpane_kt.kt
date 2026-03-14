import javax.swing.*
import java.awt.BorderLayout
import java.awt.Dimension

fun main() {
    val frame = JFrame("Kotlin JTabbedPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(500, 400)

    // 1. Create the JTabbedPane
    val tabbedPane = JTabbedPane().apply {
        // Change tab placement: TOP, BOTTOM, LEFT, or RIGHT
        tabPlacement = JTabbedPane.TOP
    }

    // 2. Create content for Tab 1
    val homePanel = JPanel().apply {
        add(JLabel("Welcome to the Home Tab"))
    }

    // 3. Create content for Tab 2
    val settingsPanel = JPanel().apply {
        add(JButton("Save Settings"))
    }

    // 4. Add tabs (Title, Icon [null here], Component, Tooltip)
    tabbedPane.addTab("Home", null, homePanel, "Go to Home")
    tabbedPane.addTab("Settings", null, settingsPanel, "Configure Options")

    frame.add(tabbedPane)
    frame.isVisible = true
}
