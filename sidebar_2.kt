import javax.swing.*
import java.awt.*

class CollapsibleSidebar : JFrame() {
    private val sidebar = JPanel()
    private val mainContent = JPanel()

    init {
        title = "Collapsible Sidebar"
        setSize(800, 500)
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = BorderLayout()

        // 1. Sidebar Setup
        sidebar.apply {
            background = Color(43, 45, 48)
            preferredSize = Dimension(200, height)
            add(JLabel("Menu Item 1").apply { foreground = Color.WHITE })
        }

        // 2. Main Content Setup
        mainContent.apply {
            background = Color.LIGHT_GRAY
            layout = FlowLayout(FlowLayout.LEFT)
            
            // The Toggle Button
            val toggleBtn = JButton("☰ Menu")
            toggleBtn.addActionListener {
                // The Magic Trick: Toggle Visibility
                sidebar.isVisible = !sidebar.isVisible
                
                // Re-layout the frame to fill the gap
                rootPane.revalidate() 
            }
            add(toggleBtn)
            add(JLabel("Main Content Area"))
        }

        // 3. Adding to Layout
        add(sidebar, BorderLayout.WEST)
        add(mainContent, BorderLayout.CENTER)
        
        setLocationRelativeTo(null)
    }
}

fun main() {
    SwingUtilities.invokeLater {
        CollapsibleSidebar().isVisible = true
    }
}
