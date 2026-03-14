import javax.swing.*
import java.awt.*

class SidebarApp : JFrame() {
    init {
        title = "Kotlin Swing Sidebar"
        defaultCloseOperation = EXIT_ON_CLOSE
        setSize(800, 500)
        layout = BorderLayout()

        // 1. Sidebar Panel
        val sidebar = JPanel().apply {
            layout = BoxLayout(this, BoxLayout.Y_AXIS)
            background = Color(45, 45, 45) // Dark theme
            preferredSize = Dimension(200, height)
            border = BorderFactory.createEmptyBorder(20, 10, 20, 10)
        }

        // 2. Main Content Area
        val mainContent = JPanel().apply {
            background = Color.WHITE
            add(JLabel("Select an option from the sidebar").apply {
                font = Font("Arial", Font.BOLD, 18)
            })
        }

        // 3. Helper function for sidebar buttons
        fun createSidebarButton(text: String) = JButton(text).apply {
            alignmentX = Component.CENTER_ALIGNMENT
            maximumSize = Dimension(180, 40)
            isFocusable = false
            foreground = Color.WHITE
            background = Color(60, 60, 60)
            isBorderPainted = false
            
            addActionListener {
                // Update main content based on click
                mainContent.removeAll()
                mainContent.add(JLabel("Viewing: $text"))
                mainContent.revalidate()
                mainContent.repaint()
            }
        }

        // Add buttons with some spacing
        sidebar.add(createSidebarButton("Dashboard"))
        sidebar.add(Box.createRigidArea(Dimension(0, 10)))
        sidebar.add(createSidebarButton("Profile"))
        sidebar.add(Box.createRigidArea(Dimension(0, 10)))
        sidebar.add(createSidebarButton("Settings"))

        // Add to Frame
        add(sidebar, BorderLayout.WEST)
        add(mainContent, BorderLayout.CENTER)
        
        setLocationRelativeTo(null)
    }
}

fun main() {
    SwingUtilities.invokeLater {
        SidebarApp().isVisible = true
    }
}
