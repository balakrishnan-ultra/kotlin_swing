import javax.swing.*
import java.awt.Dimension

fun main() {
    val frame = JFrame("Kotlin ScrollPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)

    // 1. Create the component that needs scrolling
    val textArea = JTextArea(20, 30).apply {
        text = "Type a lot of text here to see the scrollbars in action...\n".repeat(50)
        lineWrap = true
    }

    // 2. Wrap it in a JScrollPane
    val scrollPane = JScrollPane(textArea).apply {
        // Optional: Force vertical scrollbar always, horizontal only when needed
        verticalScrollBarPolicy = JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
        horizontalScrollBarPolicy = JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
    }

    // 3. Add the scrollPane (not the textArea) to the frame
    frame.add(scrollPane)
    frame.isVisible = true
}
