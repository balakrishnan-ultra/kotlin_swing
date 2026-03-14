import javax.swing.*
import java.awt.*


fun main() {
    // 1. Create the top-level frame
    val frame = JFrame("My Kotlin Swing Application")

    // 2. Optional: Set default close operation
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE

    // 3. Create components
    val label = JLabel("Hello, Swing in Kotlin!")
    val button = JButton("Click Me")
    val clear_b = JButton("Clear")
    val textField = JTextField(20) // 20 columns

    // 4. Choose a layout manager (FlowLayout is simple)
    frame.layout = FlowLayout()

    // 5. Add components to the content pane
    frame.contentPane.add(label)
    frame.contentPane.add(textField)
    frame.contentPane.add(button)
    frame.contentPane.add(clear_b)

    // 6. Set the size of the frame
    frame.size = Dimension(400, 200) // width x height

    // 7. Make the frame visible
    frame.isVisible = true

    // 8. Optional: Add event listeners (example for the button)
    button.addActionListener {
        textField.text = "Button Clicked!"
    }
    clear_b.addActionListener{
        textField.text =""
    }
}