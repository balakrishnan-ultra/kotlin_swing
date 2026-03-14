import javax.swing.*
import java.awt.Dimension

fun main() {
    val frame = JFrame("Kotlin JSplitPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(600, 400)

    // 1. Create the two components to be split
    val leftPanel = JPanel().apply {
        background = java.awt.Color.LIGHT_GRAY
        add(JLabel("Left/Top Sidebar"))
    }

    val rightPanel = JPanel().apply {
        background = java.awt.Color.WHITE
        add(JLabel("Right/Bottom Main Content"))
    }

    // 2. Initialize the SplitPane
    val splitPane = JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel).apply {
        // Set the initial location of the divider (in pixels)
        dividerLocation = 200
        
        // Allow the user to collapse one side completely with one click
        isOneTouchExpandable = true
        
        // Ensure components resize smoothly as you drag
        setContinuousLayout(true)
    }

    frame.add(splitPane)
    frame.isVisible = true
}
