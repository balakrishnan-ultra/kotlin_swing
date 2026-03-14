import javax.swing.*
import java.awt.Color
import java.awt.Dimension

fun main() {
    val frame = JFrame("Kotlin JLayeredPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 400)

    // 1. Initialize the LayeredPane
    val layeredPane = JLayeredPane()

    // 2. Create overlapping components
    // Note: Components in JLayeredPane MUST have their bounds set manually 
    // because JLayeredPane does not use a Layout Manager by default.
    
    val backLabel = JPanel().apply {
        background = Color.RED
        bounds = java.awt.Rectangle(50, 50, 200, 200)
    }

    val frontLabel = JPanel().apply {
        background = Color.BLUE
        bounds = java.awt.Rectangle(100, 100, 200, 200)
    }

    // 3. Add to pane with specific layers
    // Higher numbers are "closer" to the user
    layeredPane.add(backLabel, JLayeredPane.DEFAULT_LAYER) // Layer 0
    layeredPane.add(frontLabel, JLayeredPane.PALETTE_LAYER) // Layer 100

    frame.add(layeredPane)
    frame.isVisible = true
}
