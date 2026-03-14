import javax.swing.*
import java.awt.BorderLayout

fun main() {
    SwingUtilities.invokeLater {
        val frame = JFrame("Drag and Drop Example").apply {
            layout = BorderLayout()
            defaultCloseOperation = JFrame.EXIT_ON_CLOSE
            setSize(300, 150)
        }

        val textField = JTextField("Drag this text!")
        val textArea = JTextArea("Drop here...")

        // Enable built-in drag support
        textField.dragEnabled = true
        
        // Enable drop support
        textArea.transferHandler = TransferHandler("text")

        frame.add(textField, BorderLayout.NORTH)
        frame.add(textArea, BorderLayout.CENTER)
        frame.isVisible = true
    }
}
