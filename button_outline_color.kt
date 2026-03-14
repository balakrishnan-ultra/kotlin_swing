import javax.swing.*
import java.awt.Color
import java.awt.Dimension

fun main() {
    val frame = JFrame("Button Outline Demo")
    val button = JButton("SAVE")
    val button_2 = JButton("அஇஉஆஈஊஐஏஐஏ")

    // Set a solid 2-pixel thick blue border
    button.border = BorderFactory.createLineBorder(Color.BLUE, 2)
    button_2.border = BorderFactory.createLineBorder(Color.BLACK,5)
    
    // Optional: Make it stand out by changing the background/foreground
    button.background = Color.WHITE
    button.foreground = Color.BLUE
    button.preferredSize = Dimension(150, 50)

    button_2.background = Color.RED
    button_2.foreground = Color.BLUE
    button_2.preferredSize = Dimension(200, 60)

    val panel = JPanel()
    panel.add(button)
    panel.add(button_2)
    frame.add(panel)
    frame.setSize(300, 200)
    frame.isVisible = true
}
