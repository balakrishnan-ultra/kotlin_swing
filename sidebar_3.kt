import java.awt.*
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import javax.swing.*

class HoverSidebar : JFrame() {
    private val sidebar = JPanel()
    private val expandedWidth = 200
    private val collapsedWidth = 10

    init {
        title = "Mouse-Over Sidebar"
        setSize(800, 500)
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = BorderLayout()

        // 1. Configure Sidebar
        sidebar.apply {
            background = Color(33, 37, 41)
            preferredSize = Dimension(collapsedWidth, height) // Start collapsed
            layout = FlowLayout(FlowLayout.CENTER, 0, 20)
            
            // Add a label that only shows when expanded
            val label = JLabel("Navigation Menu").apply { 
                foreground = Color.WHITE
                isVisible = false 
            }
            add(label)

            // 2. Mouse Hover Logic
            addMouseListener(object : MouseAdapter() {
                override fun mouseEntered(e: MouseEvent?) {
                    preferredSize = Dimension(expandedWidth, height)
                    label.isVisible = true
                    revalidate() // Refresh layout
                }

                override fun mouseExited(e: MouseEvent?) {
                    // Check if mouse actually left the sidebar area
                    if (!contains(e?.point)) {
                        preferredSize = Dimension(collapsedWidth, height)
                        label.isVisible = false
                        revalidate()
                    }
                }
            })
        }

        // 3. Main Content
        val mainContent = JPanel().apply {
            background = Color.WHITE
            add(JLabel("Hover over the left edge to reveal the menu."))
        }

        add(sidebar, BorderLayout.WEST)
        add(mainContent, BorderLayout.CENTER)
        setLocationRelativeTo(null)
    }
}

fun main() {
    SwingUtilities.invokeLater {
        HoverSidebar().isVisible = true
    }
}
