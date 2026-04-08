import java.awt.*
import javax.swing.*
import javax.swing.border.EmptyBorder

class GradientPanel(
    private val color1: Color = Color(0x1e3c72),
    private val color2: Color = Color(0x2a5298),
    private val isVertical: Boolean = true
) : JPanel() {

    override fun paintComponent(g: Graphics) {
        super.paintComponent(g)
        val g2d = g as Graphics2D
        
        // Enable Antialiasing for smoother gradients
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)

        val width = width
        val height = height

        // Define start and end points
        val endX = if (isVertical) 0f else width.toFloat()
        val endY = if (isVertical) height.toFloat() else 0f

        val gp = GradientPaint(0f, 0f, color1, endX, endY, color2)
        
        g2d.paint = gp
        g2d.fillRect(0, 0, width, height)
    }
}



class GradientApp : JFrame("Modern Kotlin Swing") {
    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(400, 500)
        setLocationRelativeTo(null)

        // Main Background Panel with a Vertical Gradient
        val mainPanel = GradientPanel(Color(0x0F2027), Color(0x2C5364))
        mainPanel.layout = GridBagLayout()
        mainPanel.border = EmptyBorder(20, 20, 20, 20)

        val constraints = GridBagConstraints().apply {
            gridx = 0
            gridy = GridBagConstraints.RELATIVE
            insets = Insets(10, 10, 10, 10)
            fill = GridBagConstraints.HORIZONTAL
        }

        // Title
        val title = JLabel("Welcome Back", SwingConstants.CENTER).apply {
            foreground = Color.WHITE
            font = Font("SansSerif", Font.BOLD, 24)
        }

        // Gradient Button
        val loginBtn = object : JButton("LOGIN") {
            init {
                isContentAreaFilled = false
                isFocusPainted = false
                border = EmptyBorder(10, 20, 10, 20)
                foreground = Color.WHITE
                font = Font("SansSerif", Font.BOLD, 14)
                cursor = Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)
            }

            override fun paintComponent(g: Graphics) {
                val g2 = g.create() as Graphics2D
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON)
                // Diagonal Gradient for the button
                val gp = GradientPaint(0f, 0f, Color(0x00b09b), width.toFloat(), height.toFloat(), Color(0x96c93d))
                g2.paint = gp
                g2.fillRoundRect(0, 0, width, height, 15, 15)
                g2.dispose()
                super.paintComponent(g)
            }
        }

        mainPanel.add(title, constraints)
        mainPanel.add(loginBtn, constraints)

        contentPane = mainPanel
    }
}

fun main() {
    SwingUtilities.invokeLater {
        GradientApp().isVisible = true
    }
}
