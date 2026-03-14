/*
import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.event.ChangeEvent
import javax.swing.event.ChangeListener

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("Kotlin Swing Components Demo")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout(FlowLayout.LEFT, 10, 10) // Left alignment with gaps

    // JLabel
    frame.add(JLabel("This is a JLabel:"))

    // JTextField
    val textField = JTextField(15)
    textField.text = "Enter text here"
    frame.add(textField)

    // JButton
    val button = JButton("Click Me")
    button.addActionListener {
        JOptionPane.showMessageDialog(frame, "Button Clicked!")
    }
    frame.add(button)

    // JCheckBox
    val checkBox1 = JCheckBox("Option A")
    val checkBox2 = JCheckBox("Option B", true) // Initially selected
    frame.add(JLabel("JCheckBoxes:"))
    frame.add(checkBox1)
    frame.add(checkBox2)

    // JRadioButton
    val radioButton1 = JRadioButton("Radio 1")
    val radioButton2 = JRadioButton("Radio 2", true) // Initially selected
    val radioGroup = ButtonGroup()
    radioGroup.add(radioButton1)
    radioGroup.add(radioButton2)
    frame.add(JLabel("JRadioButtons:"))
    frame.add(radioButton1)
    frame.add(radioButton2)

    // JComboBox
    val comboBoxItems = arrayOf("Item 1", "Item 2", "Item 3", "Item 4")
    val comboBox = JComboBox(comboBoxItems)
    comboBox.selectedIndex = 0
    frame.add(JLabel("JComboBox:"))
    frame.add(comboBox)

    // JList
    val listItems = arrayOf("Apple", "Banana", "Cherry", "Date")
    val list = JList(listItems)
    list.selectionMode = ListSelectionModel.SINGLE_SELECTION
    list.visibleRowCount = 2
    frame.add(JLabel("JList:"))
    frame.add(JScrollPane(list)) // JList usually goes in a JScrollPane

    // JTextArea
    val textArea = JTextArea(5, 20)
    textArea.text = "This is a JTextArea.\nYou can type multiple lines here."
    frame.add(JLabel("JTextArea:"))
    frame.add(JScrollPane(textArea)) // JTextArea usually goes in a JScrollPane

    // JPasswordField
    val passwordField = JPasswordField(15)
    passwordField.echoChar = '*'
    frame.add(JLabel("JPasswordField:"))
    frame.add(passwordField)

    // JSlider
    val slider = JSlider(JSlider.HORIZONTAL, 0, 100, 50)
    slider.majorTickSpacing = 25
    slider.minorTickSpacing = 5
    slider.paintTicks = true
    slider.paintLabels = true
    slider.addChangeListener { e ->
        val source = e.source as JSlider
        if (!source.getValueIsAdjusting()) {
            println("Slider value: ${source.value}")
        }
    }
    frame.add(JLabel("JSlider:"))
    frame.add(slider)

    // JProgressBar
    val progressBar = JProgressBar(0, 100)
    progressBar.value = 75
   // progressBar.stringPainted = true
    frame.add(JLabel("JProgressBar:"))
    frame.add(progressBar)

    // JToggleButton
    val toggleButton = JToggleButton("Toggle")
    toggleButton.addActionListener {
        println("Toggle Button state: ${toggleButton.isSelected}")
    }
    frame.add(JLabel("JToggleButton:"))
    frame.add(toggleButton)

    frame.pack()
    frame.isVisible = true
}



*/



/*

import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("Swing JPopupMenu Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)
    frame.layout = FlowLayout()

    val panel = JPanel()
    panel.preferredSize = Dimension(300, 200)
    panel.background = Color.LIGHT_GRAY
    frame.add(panel)

    // Create the JPopupMenu
    val popupMenu = JPopupMenu()

    // Create menu items
    val menuItem1 = JMenuItem("Option 1")
    val menuItem2 = JMenuItem("Option 2")
    val menuItem3 = JMenuItem("Option 3")

    // Add action listeners to the menu items
    menuItem1.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "Option 1 selected")
    }

    menuItem2.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "Option 2 selected")
    }

    menuItem3.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "Option 3 selected")
    }

    // Add menu items to the popup menu
    popupMenu.add(menuItem1)
    popupMenu.add(menuItem2)
    popupMenu.add(menuItem3)

    // Add a separator
    popupMenu.addSeparator()

    // Create a submenu
    val subMenu = JMenu("Sub Menu")
    val subMenuItem1 = JMenuItem("Sub Option A")
    val subMenuItem2 = JMenuItem("Sub Option B")
    subMenu.add(subMenuItem1)
    subMenu.add(subMenuItem2)
    popupMenu.add(subMenu)

    // Add a MouseListener to the component where the popup should appear
    panel.addMouseListener(object : MouseAdapter() {
        override fun mouseReleased(e: MouseEvent) {
            if (e.isPopupTrigger) {
                popupMenu.show(e.component, e.x, e.y)
            }
        }
    })

    frame.isVisible = true
}


*/



/*
import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JMenuItem & JMenu Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)
    frame.layout = BorderLayout()

    // Create the JMenuBar
    val menuBar = JMenuBar()

    // Create the File menu (JMenu)
    val fileMenu = JMenu("File")
    menuBar.add(fileMenu)

    // Create File menu items (JMenuItem)
    val newItem = JMenuItem("New")
    val openItem = JMenuItem("Open")
    val saveItem = JMenuItem("Save")
    val exitItem = JMenuItem("Exit")

    // Add action listeners to File menu items
    newItem.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "New file selected")
    }

    openItem.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "Open file selected")
    }

    saveItem.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "Save file selected")
    }

    exitItem.addActionListener { e ->
        frame.dispose() // Close the window
    }

    // Add File menu items to the File menu
    fileMenu.add(newItem)
    fileMenu.add(openItem)
    fileMenu.add(saveItem)
    fileMenu.addSeparator() // Adds a visual separator
    fileMenu.add(exitItem)

    // Create the Edit menu (JMenu)
    val editMenu = JMenu("Edit")
    menuBar.add(editMenu)

    // Create Edit menu items (JMenuItem)
    val cutItem = JMenuItem("Cut")
    val copyItem = JMenuItem("Copy")
    val pasteItem = JMenuItem("Paste")

    // Add action listeners to Edit menu items
    cutItem.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "Cut selected")
    }

    copyItem.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "Copy selected")
    }

    pasteItem.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "Paste selected")
    }

    // Add Edit menu items to the Edit menu
    editMenu.add(cutItem)
    editMenu.add(copyItem)
    editMenu.add(pasteItem)

    // Create a Submenu (JMenu inside another JMenu)
    val optionsMenu = JMenu("Options")
    fileMenu.add(optionsMenu)

    // Create items for the Options submenu (JMenuItem)
    val optionAItem = JMenuItem("Option A")
    val optionBItem = JMenuItem("Option B")

    optionAItem.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "Option A selected")
    }

    optionBItem.addActionListener { e ->
        JOptionPane.showMessageDialog(frame, "Option B selected")
    }

    optionsMenu.add(optionAItem)
    optionsMenu.add(optionBItem)

    // Set the JMenuBar for the JFrame
    frame.jMenuBar = menuBar

    frame.isVisible = true
}
*/





/*
import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JColorChooser Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout()

    val chooseColorButton = JButton("Choose Color")
    val colorPanel = JPanel()
    colorPanel.preferredSize = Dimension(50, 50)
    colorPanel.background = Color.WHITE

    chooseColorButton.addActionListener {
        val initialColor = colorPanel.background
        val selectedColor = JColorChooser.showDialog(
            frame,
            "Choose a Color",
            initialColor
        )

        if (selectedColor != null) {
            colorPanel.background = selectedColor
        }
    }

    frame.add(chooseColorButton)
    frame.add(colorPanel)

    frame.pack()
    frame.isVisible = true
}

*/

/*
import javax.swing.*
import javax.swing.tree.DefaultMutableTreeNode
import javax.swing.tree.DefaultTreeModel
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JTree Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)
    frame.layout = BorderLayout()

    // Create the root node
    val root = DefaultMutableTreeNode("Root")

    // Create child nodes
    val node1 = DefaultMutableTreeNode("Node 1")
    val node2 = DefaultMutableTreeNode("Node 2")
    val node3 = DefaultMutableTreeNode("Node 3")

    // Add child nodes to the root
    root.add(node1)
    root.add(node2)
    root.add(node3)

    // Create sub-child nodes for Node 2
    val subNode2_1 = DefaultMutableTreeNode("Sub Node 2.1")
    val subNode2_2 = DefaultMutableTreeNode("Sub Node 2.2")
    node2.add(subNode2_1)
    node2.add(subNode2_2)

    // Create the JTree using the root node
    val treeModel = DefaultTreeModel(root)
    val tree = JTree(treeModel)

    // Optionally, expand all nodes initially
    for (i in 0 until tree.rowCount) {
        tree.expandRow(i)
    }

    // Create a JScrollPane to make the tree scrollable
    val scrollPane = JScrollPane(tree)

    // Add the scroll pane to the frame
    frame.add(scrollPane, BorderLayout.CENTER)

    frame.isVisible = true
}
*/

//error
/*
import javax.swing.*
import javax.swing.table.DefaultTableModel
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("Swing JTable Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = BorderLayout()

    // Sample data for the table (Array of Arrays)
    val data = arrayOf(
        arrayOf("John", "Doe", 30, true),
        arrayOf("Jane", "Smith", 25, false),
        arrayOf("Peter", "Jones", 40, true),
        arrayOf("Alice", "Brown", 22, false)
    )

    // Column headers for the table
    val columnNames = arrayOf("First Name", "Last Name", "Age", "Is Active")

    // Create a DefaultTableModel to hold the data and column names
    val tableModel = object : DefaultTableModel(data, columnNames) {
        override fun getColumnClass(columnIndex: Int): Class<*> {
            return when (columnIndex) {
                2 -> Integer::class.java // Age column should be Integer
                3 -> Boolean::class.java // Is Active column should be Boolean
                else -> String::class.java
            }
        }

        override fun isCellEditable(row: Int, column: Int): Boolean {
            // Make the "Is Active" column editable
            return column == 3
        }
    }

    // Create the JTable using the TableModel
    val table = JTable(tableModel)

    // Optionally, you can customize the table:
    table.setFillsViewportHeight(true) // Make the table fill the viewport of the scroll pane
    table.selectionMode = ListSelectionModel.SINGLE_SELECTION // Allow only single row selection

    // Create a JScrollPane to make the table scrollable if the data exceeds the visible area
    val scrollPane = JScrollPane(table)

    // Add the scroll pane to the frame (CENTER region is the default)
    frame.add(scrollPane, BorderLayout.CENTER)

    frame.pack()
    frame.isVisible = true
}
*/



/*

import javax.swing.*
import javax.swing.text.SimpleAttributeSet
import javax.swing.text.StyleConstants
import javax.swing.text.StyledDocument
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JTextPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)
    frame.layout = BorderLayout()

    val textPane = JTextPane()
    val styledDocument: StyledDocument = textPane.styledDocument

    // Create some attributes (styles)
    val boldAttributeSet = SimpleAttributeSet()
    StyleConstants.setBold(boldAttributeSet, true)

    val italicAttributeSet = SimpleAttributeSet()
    StyleConstants.setItalic(italicAttributeSet, true)
    StyleConstants.setForeground(italicAttributeSet, Color.BLUE)

    val largeFontAttributeSet = SimpleAttributeSet()
    StyleConstants.setFontSize(largeFontAttributeSet, 18)
    StyleConstants.setForeground(largeFontAttributeSet, Color.RED)

    try {
        // Insert text with different styles
        styledDocument.insertString(styledDocument.length, "This is ", null)
        styledDocument.insertString(styledDocument.length, "bold ", boldAttributeSet)
        styledDocument.insertString(styledDocument.length, "and this is ", null)
        styledDocument.insertString(styledDocument.length, "italic blue", italicAttributeSet)
        styledDocument.insertString(styledDocument.length, ".\n", null)
        styledDocument.insertString(styledDocument.length, "Here is some ", null)
        styledDocument.insertString(styledDocument.length, "large red text", largeFontAttributeSet)
        styledDocument.insertString(styledDocument.length, ".\n", null)
        styledDocument.insertString(styledDocument.length, "Plain text again.\n", null)

    } catch (e: Exception) {
        e.printStackTrace()
    }

    // Make the JTextPane scrollable
    val scrollPane = JScrollPane(textPane)

    frame.add(scrollPane, BorderLayout.CENTER)
    frame.isVisible = true
}

*/



/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JSplitPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(600, 400)

    // Create the left component
    val leftPanel = JPanel()
    leftPanel.background = Color.LIGHT_GRAY
    val leftLabel = JLabel("Left Component")
    leftPanel.add(leftLabel)

    // Create the right component
    val rightPanel = JPanel()
    rightPanel.background = Color.CYAN
    val rightLabel = JLabel("Right Component")
    rightPanel.add(rightLabel)

    // Create the JSplitPane
    val splitPane = JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel)

    // Set the initial divider location (percentage of the total size)
    splitPane.resizeWeight = 0.5

    // One-touch expandable (adds a little arrow button to collapse/expand)
    splitPane.isOneTouchExpandable = true

    // Set the divider size (in pixels)
    splitPane.dividerSize = 10

    // Add the JSplitPane to the frame
    frame.add(splitPane, BorderLayout.CENTER)

    frame.isVisible = true
}
*/



/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JPanel Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)
    frame.layout = FlowLayout() // Default layout for JFrame

    // Create the first JPanel
    val panel1 = JPanel()
    panel1.background = Color.LIGHT_GRAY
    panel1.preferredSize = Dimension(150, 100)
    val label1 = JLabel("Panel 1")
    panel1.add(label1)

    // Create the second JPanel with a different layout
    val panel2 = JPanel(BorderLayout())
    panel2.background = Color.CYAN
    panel2.preferredSize = Dimension(200, 150)
    val label2_north = JLabel("North")
    val label2_south = JLabel("South")
    val button2_center = JButton("Center Button")
    panel2.add(label2_north, BorderLayout.NORTH)
    panel2.add(label2_south, BorderLayout.SOUTH)
    panel2.add(button2_center, BorderLayout.CENTER)

    // Create the third JPanel with no explicit layout (uses FlowLayout by default)
    val panel3 = JPanel()
    panel3.background = Color.YELLOW
    val checkBox3_1 = JCheckBox("Check 1")
    val checkBox3_2 = JCheckBox("Check 2")
    panel3.add(checkBox3_1)
    panel3.add(checkBox3_2)

    // Add the JPanels to the JFrame
    frame.add(panel1)
    frame.add(panel2)
    frame.add(panel3)

    frame.isVisible = true
}

*/


/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JSeparator Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 200)
    frame.layout = FlowLayout(FlowLayout.CENTER, 10, 10) // Center alignment with gaps

    // Create labels to be separated
    val label1 = JLabel("Label Above Separator")
    val label2 = JLabel("Label Below Separator")

    // Create a horizontal JSeparator
    val separatorHorizontal = JSeparator(SwingConstants.HORIZONTAL)
    separatorHorizontal.preferredSize = Dimension(300, 5) // Set a preferred width and small height

    // Create another set of labels
    val labelLeft = JLabel("Left")
    val labelRight = JLabel("Right")

    // Create a vertical JSeparator
    val separatorVertical = JSeparator(SwingConstants.VERTICAL)
    separatorVertical.preferredSize = Dimension(5, 100) // Set a small width and preferred height

    // Add components to the frame
    frame.add(label1)
    frame.add(separatorHorizontal)
    frame.add(label2)

    frame.add(labelLeft)
    frame.add(separatorVertical)
    frame.add(labelRight)

    frame.pack()
    frame.isVisible = true
}
*/




//error
/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JToolBar Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(600, 400)
    frame.layout = BorderLayout()

    // Create the JToolBar
    val toolBar = JToolBar("Main Toolbar")
    toolBar.isFloatable = false // Prevent the toolbar from being detached

    // Create buttons for the toolbar
    val newButton = JButton(ImageIcon(javaClass.getResource("/images/new.png"))) // Replace with your image path
    newButton.toolTipText = "Create New File"
    newButton.addActionListener {
        JOptionPane.showMessageDialog(frame, "New action")
    }
    toolBar.add(newButton)

    val openButton = JButton(ImageIcon(javaClass.getResource("/images/open.png"))) // Replace with your image path
    openButton.toolTipText = "Open File"
    openButton.addActionListener {
        JOptionPane.showMessageDialog(frame, "Open action")
    }
    toolBar.add(openButton)

    val saveButton = JButton(ImageIcon(javaClass.getResource("/images/save.png"))) // Replace with your image path
    saveButton.toolTipText = "Save File"
    saveButton.addActionListener {
        JOptionPane.showMessageDialog(frame, "Save action")
    }
    toolBar.add(saveButton)

    // Add a separator
    toolBar.addSeparator()

    val cutButton = JButton(ImageIcon(javaClass.getResource("/images/cut.png"))) // Replace with your image path
    cutButton.toolTipText = "Cut"
    cutButton.addActionListener {
        JOptionPane.showMessageDialog(frame, "Cut action")
    }
    toolBar.add(cutButton)

    val copyButton = JButton(ImageIcon(javaClass.getResource("/images/copy.png"))) // Replace with your image path
    copyButton.toolTipText = "Copy"
    copyButton.addActionListener {
        JOptionPane.showMessageDialog(frame, "Copy action")
    }
    toolBar.add(copyButton)

    val pasteButton = JButton(ImageIcon(javaClass.getResource("/images/paste.png"))) // Replace with your image path
    pasteButton.toolTipText = "Paste"
    pasteButton.addActionListener {
        JOptionPane.showMessageDialog(frame, "Paste action")
    }
    toolBar.add(pasteButton)

    // Add a combobox to the toolbar
    val comboBoxItems = arrayOf("Option A", "Option B", "Option C")
    val comboBox = JComboBox(comboBoxItems)
    comboBox.toolTipText = "Select an option"
    toolBar.add(comboBox)

    // Add the toolbar to the NORTH of the frame
    frame.add(toolBar, BorderLayout.NORTH)

    // Create a central panel (optional)
    val centerPanel = JPanel()
    centerPanel.background = Color.WHITE
    val centerLabel = JLabel("Main Content Area")
    centerPanel.add(centerLabel)
    frame.add(centerPanel, BorderLayout.CENTER)

    frame.isVisible = true
}
*/



/*
import javax.swing.*
import java.awt.*
import java.io.File

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JFileChooser Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(500, 400)
    frame.layout = FlowLayout()

    val openButton = JButton("Open File")
    val saveButton = JButton("Save File")
    val directoryButton = JButton("Choose Directory")
    val selectedFileLabel = JLabel("No file selected")
    val selectedDirectoryLabel = JLabel("No directory selected")

    // Open File Action
    openButton.addActionListener {
        val fileChooser = JFileChooser()
        val result = fileChooser.showOpenDialog(frame)

        if (result == JFileChooser.APPROVE_OPTION) {
            val selectedFile = fileChooser.selectedFile
            selectedFileLabel.text = "Opened file: ${selectedFile.absolutePath}"
        } else {
            selectedFileLabel.text = "Open operation cancelled"
        }
    }

    // Save File Action
    saveButton.addActionListener {
        val fileChooser = JFileChooser()
        val result = fileChooser.showSaveDialog(frame)

        if (result == JFileChooser.APPROVE_OPTION) {
            val selectedFile = fileChooser.selectedFile
            selectedFileLabel.text = "Save to: ${selectedFile.absolutePath}"
            // In a real application, you would then proceed to save data to this file.
        } else {
            selectedFileLabel.text = "Save operation cancelled"
        }
    }

    // Choose Directory Action
    directoryButton.addActionListener {
        val directoryChooser = JFileChooser()
        directoryChooser.fileSelectionMode = JFileChooser.DIRECTORIES_ONLY
        val result = directoryChooser.showDialog(frame, "Select Directory")

        if (result == JFileChooser.APPROVE_OPTION) {
            val selectedDirectory = directoryChooser.selectedFile
            selectedDirectoryLabel.text = "Selected directory: ${selectedDirectory.absolutePath}"
        } else {
            selectedDirectoryLabel.text = "Directory selection cancelled"
        }
    }

    frame.add(openButton)
    frame.add(saveButton)
    frame.add(directoryButton)
    frame.add(selectedFileLabel)
    frame.add(selectedDirectoryLabel)

    frame.isVisible = true
}
*/


/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JDesktopPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(800, 600)

    // Create the JDesktopPane
    val desktopPane = JDesktopPane()
    frame.contentPane = desktopPane

    // Create internal frames
    createInternalFrame("Frame 1", 50, 50, 300, 200, desktopPane)
    createInternalFrame("Frame 2", 150, 100, 350, 250, desktopPane)
    createInternalFrame("Frame 3", 250, 150, 250, 180, desktopPane)

    frame.isVisible = true
}

fun createInternalFrame(title: String, x: Int, y: Int, width: Int, height: Int, desktopPane: JDesktopPane) {
    val internalFrame = JInternalFrame(title, true, true, true, true) // resizable, closable, maximizable, iconifiable
    internalFrame.setBounds(x, y, width, height)

    val label = JLabel("This is content for $title")
    label.horizontalAlignment = SwingConstants.CENTER
    internalFrame.contentPane.add(label, BorderLayout.CENTER)

    internalFrame.isVisible = true
    desktopPane.add(internalFrame)

    // Optionally, select the newly created frame
    try {
        internalFrame.isSelected = true
    } catch (e: java.beans.PropertyVetoException) {
        e.printStackTrace()
    }
}

*/


/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JLayeredPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)
    frame.layout = null // Use null layout for manual positioning

    val layeredPane = JLayeredPane()
    layeredPane.preferredSize = Dimension(300, 200)

    // Create components with different background colors and sizes
    val label1 = JLabel("Layer 1 (Bottom)")
    label1.background = Color.YELLOW
    label1.isOpaque = true
    label1.setBounds(20, 20, 150, 100)

    val label2 = JLabel("Layer 2 (Middle)")
    label2.background = Color.GREEN
    label2.isOpaque = true
    label2.setBounds(80, 50, 150, 100)

    val label3 = JLabel("Layer 3 (Top)")
    label3.background = Color.CYAN
    label3.isOpaque = true
    label3.setBounds(140, 80, 150, 100)

    // Add components to the layered pane with different layers
    layeredPane.add(label1, JLayeredPane.DEFAULT_LAYER)
    layeredPane.add(label2, JLayeredPane.MODAL_LAYER)
    layeredPane.add(label3, JLayeredPane.POPUP_LAYER)

    // Add the layered pane to the frame
    frame.contentPane = layeredPane

    frame.isVisible = true
}
*/

/*
import javax.swing.*
import java.awt.*
import java.io.IOException
import java.net.URL

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JEditorPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(600, 400)
    frame.layout = BorderLayout()

    val editorPane = JEditorPane()
    editorPane.isEditable = false // Make it read-only by default

    // Load HTML content from a String
    val htmlContent = """
        <html>
        <head>
            <title>Sample HTML</title>
        </head>
        <body>
            <h1>Welcome to JEditorPane</h1>
            <p>This component can display <b>HTML</b> content.</p>
            <ul>
                <li>Item 1</li>
                <li>Item 2</li>
                <li><a href="https://www.example.com">Example Link</a></li>
            </ul>
        </body>
        </html>
    """.trimIndent()

    editorPane.contentType = "text/html"
    editorPane.text = htmlContent

    // Alternatively, load content from a URL
    /*
    try {
        val url = URL("https://www.google.com")
        editorPane.page = url
    } catch (e: IOException) {
        editorPane.text = "Error loading URL: ${e.message}"
        e.printStackTrace()
    }
    */

    // Make the JEditorPane scrollable
    val scrollPane = JScrollPane(editorPane)

    frame.add(scrollPane, BorderLayout.CENTER)
    frame.isVisible = true
}
*/

/*
import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.ItemEvent
import java.awt.event.ItemListener

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JComboBox Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(300, 200)
    frame.layout = FlowLayout()

    // Create an array of items for the JComboBox
    val items = arrayOf("Apple", "Banana", "Cherry", "Date", "Elderberry")

    // Create the JComboBox
    val comboBox = JComboBox(items)

    // Set the initially selected item (by index)
    comboBox.selectedIndex = 1 // Select "Banana"

    // Alternatively, set the initially selected item (by value)
    // comboBox.selectedItem = "Cherry"

    // Add an ActionListener (triggered when the user makes a selection)
    comboBox.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            val selectedItem = comboBox.selectedItem
            println("Action: Selected item is: $selectedItem")
        }
    })

    // Add an ItemListener (triggered when the selection state changes)
    comboBox.addItemListener(object : ItemListener {
        override fun itemStateChanged(e: ItemEvent?) {
            if (e?.stateChange == ItemEvent.SELECTED) {
                val selectedItem = e.item
                println("Item: Selected item changed to: $selectedItem")
            }
        }
    })

    // Add the JComboBox to the frame
    frame.add(comboBox)

    frame.isVisible = true
}
*/


/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JViewport Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(300, 200)
    frame.layout = BorderLayout()

    // Create a large panel with content
    val contentPanel = JPanel()
    contentPanel.layout = FlowLayout(FlowLayout.LEFT, 20, 20)
    contentPanel.preferredSize = Dimension(500, 400) // Larger than the viewport
    contentPanel.background = Color.LIGHT_GRAY

    for (i in 1..20) {
        val button = JButton("Button $i")
        contentPanel.add(button)
    }

    // Create the JViewport
    val viewport = JViewport()
    viewport.view = contentPanel // Set the view to our large panel
    viewport.extentSize = Dimension(300, 200) // Set the visible area size

    // Create a JScrollPane and set its viewport
    val scrollPane = JScrollPane()
    scrollPane.viewport = viewport

    // Alternatively, you can directly add the large panel to a JScrollPane,
    // and the JScrollPane will automatically create and manage the JViewport.
    // val scrollPane = JScrollPane(contentPanel)

    frame.add(scrollPane, BorderLayout.CENTER)
    frame.isVisible = true
}
*/

/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JScrollPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)
    frame.layout = BorderLayout()

    // Create a large text area
    val textArea = JTextArea(20, 30)
    for (i in 1..100) {
        textArea.append("This is line $i\n")
    }

    // Create a JScrollPane and add the JTextArea to it
    val scrollPane = JScrollPane(textArea)

    // Optionally, set scrollbar policies
    scrollPane.horizontalScrollBarPolicy = JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED
    scrollPane.verticalScrollBarPolicy = JScrollPane.VERTICAL_SCROLLBAR_ALWAYS

    // Add the scroll pane to the frame
    frame.add(scrollPane, BorderLayout.CENTER)

    // Example with a large JPanel
    val largePanel = JPanel()
    largePanel.preferredSize = Dimension(600, 500)
    largePanel.background = Color.LIGHT_GRAY
    val scrollPaneForPanel = JScrollPane(largePanel)
    // frame.add(scrollPaneForPanel, BorderLayout.SOUTH) // Uncomment to add another scroll pane

    frame.isVisible = true
}
*/


/*
import javax.swing.*
import java.awt.*
import javax.swing.event.ListSelectionEvent
import javax.swing.event.ListSelectionListener

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JList Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(300, 200)
    frame.layout = BorderLayout()

    // Create an array of items for the JList
    val listData = arrayOf("Apple", "Banana", "Cherry", "Date", "Elderberry", "Fig", "Grape", "Honeydew")

    // Create the JList
    val list = JList(listData)

    // Set the selection mode (single, multiple, interval)
    list.selectionMode = ListSelectionModel.SINGLE_SELECTION
    // list.selectionMode = ListSelectionModel.MULTIPLE_INTERVAL_SELECTION

    // Set the number of visible rows (helps with layout in scroll panes)
    list.visibleRowCount = 4

    // Add a ListSelectionListener to handle selection events
    list.addListSelectionListener(object : ListSelectionListener {
        override fun valueChanged(e: ListSelectionEvent?) {
            if (!e!!.valueIsAdjusting) { // Ignore events while the selection is being adjusted
                val selectedIndex = list.selectedIndex
                val selectedValue = list.selectedValue
                println("Selection changed:")
                println("  Index: $selectedIndex")
                println("  Value: $selectedValue")

                val selectedIndices = list.selectedIndices
                val selectedValuesList = list.selectedValuesList
                if (selectedIndices.isNotEmpty()) {
                    println("  Selected Indices: ${selectedIndices.joinToString()}")
                    println("  Selected Values: ${selectedValuesList.joinToString()}")
                }
            }
        }
    })

    // Create a JScrollPane to make the list scrollable if there are many items
    val scrollPane = JScrollPane(list)

    // Add the scroll pane to the frame
    frame.add(scrollPane, BorderLayout.CENTER)

    frame.isVisible = true
}
*/




//error
/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JTabbedPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)
    frame.layout = BorderLayout()

    val tabbedPane = JTabbedPane()

    // Create the first tab
    val panel1 = JPanel()
    panel1.background = Color.LIGHT_GRAY
    val label1 = JLabel("This is Tab 1")
    panel1.add(label1)
    tabbedPane.addTab("Tab 1", panel1)

    // Create the second tab
    val panel2 = JPanel()
    panel2.background = Color.CYAN
    val label2 = JLabel("Content for Tab 2")
    panel2.add(label2)
    val button2 = JButton("Click Me")
    panel2.add(button2)
    tabbedPane.addTab("Tab 2", panel2)

    // Create the third tab with an icon
    val panel3 = JPanel()
    panel3.background = Color.YELLOW
    val label3 = JLabel("Tab 3 with Icon")
    panel3.add(label3)
    val icon = ImageIcon(javaClass.getResource("/images/info.png")) // Replace with your icon path
    tabbedPane.addTab("Tab 3", icon, panel3, "Information Tab") // Title, Icon, Component, Tooltip

    // Create the fourth tab (initially disabled)
    val panel4 = JPanel()
    panel4.background = Color.PINK
    val label4 = JLabel("This Tab is Disabled")
    panel4.add(label4)
    tabbedPane.addTab("Disabled Tab", panel4)
    tabbedPane.setEnabledAt(3, false) // Disable the fourth tab (index 3)

    // Add the tabbed pane to the frame
    frame.add(tabbedPane, BorderLayout.CENTER)

    frame.isVisible = true
}
*/


/*
import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.ItemEvent
import java.awt.event.ItemListener

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JCheckBoxMenuItem Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)
    frame.layout = BorderLayout()

    // Create a JMenuBar
    val menuBar = JMenuBar()

    // Create a JMenu
    val optionsMenu = JMenu("Options")
    menuBar.add(optionsMenu)

    // Create JCheckBoxMenuItems
    val boldMenuItem = JCheckBoxMenuItem("Bold")
    val italicMenuItem = JCheckBoxMenuItem("Italic")
    val underlineMenuItem = JCheckBoxMenuItem("Underline")

    // Set initial state (optional)
    italicMenuItem.isSelected = true

    // Add ActionListeners (triggered when the menu item is clicked)
    boldMenuItem.addActionListener { e ->
        println("Bold menu item clicked. State: ${boldMenuItem.isSelected}")
    }

    italicMenuItem.addActionListener { e ->
        println("Italic menu item clicked. State: ${italicMenuItem.isSelected}")
    }

    underlineMenuItem.addActionListener { e ->
        println("Underline menu item clicked. State: ${underlineMenuItem.isSelected}")
    }

    // Alternatively, use ItemListeners (triggered when the selection state changes)
    boldMenuItem.addItemListener { e ->
        println("Bold item state changed. Selected: ${e.stateChange == ItemEvent.SELECTED}")
    }

    italicMenuItem.addItemListener { e ->
        println("Italic item state changed. Selected: ${e.stateChange == ItemEvent.SELECTED}")
    }

    underlineMenuItem.addItemListener { e ->
        println("Underline item state changed. Selected: ${e.stateChange == ItemEvent.SELECTED}")
    }

    // Add the JCheckBoxMenuItems to the JMenu
    optionsMenu.add(boldMenuItem)
    optionsMenu.add(italicMenuItem)
    optionsMenu.add(underlineMenuItem)

    // Set the JMenuBar for the JFrame
    frame.jMenuBar = menuBar

    frame.isVisible = true
}
*/



//error
/*
import javax.swing.JOptionPane
import javax.swing.SwingUtilities

fun main() {
    SwingUtilities.invokeLater {
        showOptionPaneExamples()
    }
}

fun showOptionPaneExamples() {
    // 1. Show a simple message dialog with an "OK" button
    JOptionPane.showMessageDialog(null, "This is a simple message.")

    // 2. Show a message dialog with a custom title and icon
    JOptionPane.showMessageDialog(
        null,
        "Information message with custom icon.",
        "Information",
        JOptionPane.INFORMATION_MESSAGE
    )

    // 3. Show a warning message dialog
    JOptionPane.showMessageDialog(
        null,
        "This is a warning!",
        "Warning",
        JOptionPane.WARNING_MESSAGE
    )

    // 4. Show an error message dialog
    JOptionPane.showMessageDialog(
        null,
        "An error has occurred.",
        "Error",
        JOptionPane.ERROR_MESSAGE
    )

    // 5. Show a question message dialog with "Yes" and "No" options
    val result = JOptionPane.showConfirmDialog(
        null,
        "Are you sure you want to continue?",
        "Confirm",
        JOptionPane.YES_NO_OPTION
    )
    if (result == JOptionPane.YES_OPTION) {
        println("User chose Yes.")
    } else {
        println("User chose No or closed the dialog.")
    }

    // 6. Show a question message dialog with "Yes", "No", and "Cancel" options
    val result2 = JOptionPane.showConfirmDialog(
        null,
        "Save changes?",
        "Save",
        JOptionPane.YES_NO_CANCEL_OPTION
    )
    when (result2) {
        JOptionPane.YES_OPTION -> println("User chose Yes (Save).")
        JOptionPane.NO_OPTION -> println("User chose No (Don't Save).")
        JOptionPane.CANCEL_OPTION -> println("User chose Cancel.")
        JOptionPane.CLOSED_OPTION -> println("User closed the dialog.")
    }

    // 7. Show an input dialog to get text input from the user
    val userInput = JOptionPane.showInputDialog(null, "Enter your name:")
    if (!userInput.isNullOrEmpty()) {
        println("User entered: $userInput")
    } else {
        println("User cancelled or entered nothing.")
    }

    // 8. Show an input dialog with a custom title and initial value
    val city = JOptionPane.showInputDialog(
        null,
        "Enter your city:",
        "City Input",
        JOptionPane.QUESTION_MESSAGE,
        null, // Use default icon
        null, // Initial selection value
        "Hosur" // Initial text value
    )
    if (!city.isNullOrEmpty()) {
        println("User's city: $city")
    }

    // 9. Show an option dialog with custom buttons
    val options = arrayOf("Red", "Green", "Blue", "Cancel")
    val choice = JOptionPane.showOptionDialog(
        null,
        "Choose a color:",
        "Color Choice",
        JOptionPane.DEFAULT_OPTION,
        JOptionPane.QUESTION_MESSAGE,
        null,
        options,
        options[0] // Initially selected option
    )
    if (choice in 0 until options.size - 1) {
        println("User chose: ${options[choice]}")
    } else if (choice == options.size - 1 || choice == JOptionPane.CLOSED_OPTION) {
        println("User cancelled or closed.")
    }
}
*/


/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JSplitPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(600, 400)
    frame.layout = BorderLayout()

    // Create the left component
    val leftPanel = JPanel()
    leftPanel.background = Color.LIGHT_GRAY
    val leftLabel = JLabel("Left Component")
    leftPanel.add(leftLabel)

    // Create the right component
    val rightPanel = JPanel()
    rightPanel.background = Color.CYAN
    val rightLabel = JLabel("Right Component")
    rightPanel.add(rightLabel)

    // Create the JSplitPane
    val splitPane = JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel)

    // Set the initial divider location (percentage of the total size)
    splitPane.resizeWeight = 0.5

    // One-touch expandable (adds a little arrow button to collapse/expand)
    splitPane.isOneTouchExpandable = true

    // Set the divider size (in pixels)
    splitPane.dividerSize = 10

    // Add the JSplitPane to the frame
    frame.add(splitPane, BorderLayout.CENTER)

    frame.isVisible = true
}
*/



/*
import javax.swing.*
import java.awt.*

fun main() {
    SwingUtilities.invokeLater {
        createAndShowGUI()
    }
}

fun createAndShowGUI() {
    val frame = JFrame("JRootPane Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.size = Dimension(400, 300)

    // JFrame already has a JRootPane by default, so we don't usually create one explicitly
    val rootPane: JRootPane = frame.rootPane

    // Get the content pane (where you usually add your components)
    val contentPane: Container = rootPane.contentPane
    contentPane.layout = FlowLayout()

    val label = JLabel("This label is in the content pane.")
    val button = JButton("Click Me")
    contentPane.add(label)
    contentPane.add(button)

    // Get the glass pane (for drawing over all other components)
    val glassPane: JPanel = rootPane.glassPane as JPanel
    glassPane.isOpaque = false // Make it transparent
    glassPane.isVisible = false // Initially hidden

    // Example: Make the glass pane visible on button click
    button.addActionListener {
        glassPane.isVisible = !glassPane.isVisible
        rootPane.repaint() // Force a repaint to show/hide the glass pane
    }

    // Example: Add a custom component to the glass pane (for demonstration)
    val glassPaneLabel = JLabel("Glass Pane Active!")
    glassPaneLabel.foreground = Color.RED
    glassPane.add(glassPaneLabel)

    // Get the menu bar pane (where the JMenuBar goes)
    val menuBar = JMenuBar()
    val fileMenu = JMenu("File")
    fileMenu.add(JMenuItem("Open"))
    menuBar.add(fileMenu)
    rootPane.jMenuBar = menuBar

    frame.isVisible = true
}
*/


/*
import java.awt.*
import java.awt.event.*
import javax.swing.*

class ScrollbarDemo : JFrame("JScrollBar Example") {

    private val textArea = JTextArea(10, 30)
    private val verticalScrollBar = JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 100)
    private val horizontalScrollBar = JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 100)

    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        layout = FlowLayout()

        val scrollPane = JScrollPane(textArea)
        scrollPane.verticalScrollBarPolicy = JScrollPane.VERTICAL_SCROLLBAR_NEVER
        scrollPane.horizontalScrollBarPolicy = JScrollPane.HORIZONTAL_SCROLLBAR_NEVER

        add(scrollPane)
        add(verticalScrollBar)
        add(horizontalScrollBar)

        verticalScrollBar.addAdjustmentListener { e ->
            val value = e.value
            textArea.append("Vertical Scrollbar Value: $value\n")
        }

        horizontalScrollBar.addAdjustmentListener { e ->
            val value = e.value
            textArea.append("Horizontal Scrollbar Value: $value\n")
        }

        pack()
        isVisible = true
    }
}

fun main() {
    SwingUtilities.invokeLater {
        ScrollbarDemo()
    }
}
*/




/*
import java.awt.*
import java.awt.event.*
import javax.swing.*

class MenuItemDemo : JFrame("JMenuItem Example") {

    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        layout = FlowLayout()

        // Create a JMenuBar
        val menuBar = JMenuBar()

        // Create a JMenu
        val fileMenu = JMenu("File")
        menuBar.add(fileMenu)

        // Create JMenuItems
        val newItem = JMenuItem("New")
        val openItem = JMenuItem("Open")
        val saveItem = JMenuItem("Save")
        val exitItem = JMenuItem("Exit")

        // Add JMenuItems to the JMenu
        fileMenu.add(newItem)
        fileMenu.add(openItem)
        fileMenu.add(saveItem)
        fileMenu.addSeparator() // Adds a visual separator
        fileMenu.add(exitItem)

        // Add action listeners to the JMenuItems
        newItem.addActionListener {
            println("New item clicked")
            // Add your "New" action logic here
        }

        openItem.addActionListener {
            println("Open item clicked")
            // Add your "Open" action logic here
        }

        saveItem.addActionListener {
            println("Save item clicked")
            // Add your "Save" action logic here
        }

        exitItem.addActionListener {
            println("Exit item clicked")
            dispose() // Close the window
            System.exit(0) // Terminate the application
        }

        // Set the JMenuBar for the JFrame
        jMenuBar = menuBar

        pack()
        isVisible = true
    }
}

fun main() {
    SwingUtilities.invokeLater {
        MenuItemDemo()
    }
}
*/


/*
import java.awt.*
import javax.swing.*

class MenuDemo : JFrame("JMenu Example") {

    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        layout = FlowLayout()

        // Create a JMenuBar
        val menuBar = JMenuBar()

        // Create the "File" JMenu
        val fileMenu = JMenu("File")
        menuBar.add(fileMenu)

        // Create JMenuItems for the "File" menu
        val newItem = JMenuItem("New")
        val openItem = JMenuItem("Open")
        val saveItem = JMenuItem("Save")
        val exitItem = JMenuItem("Exit")

        // Add JMenuItems to the "File" JMenu
        fileMenu.add(newItem)
        fileMenu.add(openItem)
        fileMenu.add(saveItem)
        fileMenu.addSeparator() // Adds a visual separator
        fileMenu.add(exitItem)

        // Add action listeners to the JMenuItems (explained in JMenuItem example)
        newItem.addActionListener { println("New clicked") }
        openItem.addActionListener { println("Open clicked") }
        saveItem.addActionListener { println("Save clicked") }
        exitItem.addActionListener { dispose(); System.exit(0) }

        // Create the "Edit" JMenu
        val editMenu = JMenu("Edit")
        menuBar.add(editMenu)

        // Create JMenuItems for the "Edit" menu
        val cutItem = JMenuItem("Cut")
        val copyItem = JMenuItem("Copy")
        val pasteItem = JMenuItem("Paste")

        // Add JMenuItems to the "Edit" JMenu
        editMenu.add(cutItem)
        editMenu.add(copyItem)
        editMenu.add(pasteItem)

        // Add action listeners for "Edit" menu items
        cutItem.addActionListener { println("Cut clicked") }
        copyItem.addActionListener { println("Copy clicked") }
        pasteItem.addActionListener { println("Paste clicked") }

        // Set the JMenuBar for the JFrame
        jMenuBar = menuBar

        pack()
        isVisible = true
    }
}

fun main() {
    SwingUtilities.invokeLater {
        MenuDemo()
    }
}
*/




/*
import java.awt.*
import java.awt.event.*
import javax.swing.*

class PopupMenuDemo : JFrame("JPopupMenu Example") {

    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        layout = FlowLayout()

        val panel = JPanel()
        panel.preferredSize = Dimension(300, 200)
        add(panel)

        // Create the JPopupMenu
        val popupMenu = JPopupMenu()

        // Create JMenuItems for the popup menu
        val item1 = JMenuItem("Option 1")
        val item2 = JMenuItem("Option 2")
        val item3 = JMenuItem("Option 3")

        // Add JMenuItems to the JPopupMenu
        popupMenu.add(item1)
        popupMenu.add(item2)
        popupMenu.add(item3)

        // Add action listeners to the JMenuItems
        item1.addActionListener { println("Option 1 clicked") }
        item2.addActionListener { println("Option 2 clicked") }
        item3.addActionListener { println("Option 3 clicked") }

        // Add a MouseListener to the panel to show the popup menu on right-click
        panel.addMouseListener(object : MouseAdapter() {
            override fun mouseReleased(e: MouseEvent) {
                if (e.isPopupTrigger) {
                    popupMenu.show(e.component, e.x, e.y)
                }
            }
        })

        pack()
        isVisible = true
    }
}

fun main() {
    SwingUtilities.invokeLater {
        PopupMenuDemo()
    }
}

*/



//error
/*
import java.awt.*
import java.util.*
import javax.swing.*
import kotlin.concurrent.schedule

class ProgressBarDemo : JFrame("JProgressBar Example") {

    private val progressBar = JProgressBar(0, 100)
    private val startButton = JButton("Start Task")

    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        layout = FlowLayout()

        progressBar.value = 0
        progressBar.stringPainted = true // Display percentage string
        add(progressBar)
        add(startButton)

        startButton.addActionListener {
            startButton.isEnabled = false
            startLongTask()
        }

        pack()
        isVisible = true
    }

    private fun startLongTask() {
        val timer = Timer()
        val totalSteps = 100
        var currentStep = 0

        timer.schedule(0, 100) { // Execute every 100 milliseconds
            currentStep++
            progressBar.value = currentStep

            if (currentStep >= totalSteps) {
                timer.cancel()
                startButton.isEnabled = true
                JOptionPane.showMessageDialog(this@ProgressBarDemo, "Task completed!", "Done", JOptionPane.INFORMATION_MESSAGE)
            }
        }
    }
}

fun main() {
    SwingUtilities.invokeLater {
        ProgressBarDemo()
    }
}
*/



/*
import java.awt.*
import javax.swing.*
import javax.swing.event.ChangeEvent
import javax.swing.event.ChangeListener

class SliderDemo : JFrame("JSlider Example") {

    private val slider = JSlider(JSlider.HORIZONTAL, 0, 100, 50) // min, max, initial
    private val valueLabel = JLabel("Current Value: ${slider.value}")

    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        layout = FlowLayout()

        // Configure the slider
        slider.majorTickSpacing = 20
        slider.minorTickSpacing = 5
        slider.paintTicks = true
        slider.paintLabels = true

        // Add ChangeListener to the slider
        slider.addChangeListener(object : ChangeListener {
            override fun stateChanged(e: ChangeEvent) {
                valueLabel.text = "Current Value: ${slider.value}"
            }
        })

        add(slider)
        add(valueLabel)

        pack()
        isVisible = true
    }
}

fun main() {
    SwingUtilities.invokeLater {
        SliderDemo()
    }
}
*/



/*
import java.awt.*
import javax.swing.*
import javax.swing.event.ChangeEvent
import javax.swing.event.ChangeListener

class SpinnerNumberDemo : JFrame("JSpinner Number Example") {

    private val spinnerModel = SpinnerNumberModel(5, 0, 10, 1) // initial, min, max, step
    private val spinner = JSpinner(spinnerModel)
    private val valueLabel = JLabel("Current Value: ${spinner.value}")

    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        layout = FlowLayout()

        spinner.addChangeListener {
            valueLabel.text = "Current Value: ${spinner.value}"
        }

        add(spinner)
        add(valueLabel)

        pack()
        isVisible = true
    }
}

fun main() {
    SwingUtilities.invokeLater {
        SpinnerNumberDemo()
    }
}
*/




/*
import java.awt.*
import javax.swing.*

class BasicDialog(parent: JFrame) : JDialog(parent, "Basic Dialog", true) {

    init {
        defaultCloseOperation = DISPOSE_ON_CLOSE // Close only this dialog
        layout = FlowLayout()

        val messageLabel = JLabel("This is a basic modal dialog.")
        val closeButton = JButton("Close")

        closeButton.addActionListener {
            dispose() // Close the dialog
        }

        add(messageLabel)
        add(closeButton)

        pack()
        setLocationRelativeTo(parent) // Center relative to the parent
        isVisible = true // Make the dialog visible (and block parent)
    }
}

class DialogDemo : JFrame("Dialog Demo") {

    init {
        defaultCloseOperation = EXIT_ON_CLOSE
        layout = FlowLayout()

        val openDialogButton = JButton("Open Dialog")
        openDialogButton.addActionListener {
            BasicDialog(this) // Create and show the modal dialog
        }

        add(openDialogButton)

        pack()
        setLocationRelativeTo(null) // Center on screen
        isVisible = true
    }
}

fun main() {
    SwingUtilities.invokeLater {
        DialogDemo()
    }
}
*/


//error
/*
import java.awt.*
import javax.swing.*

class ToolbarDemo : JFrame("JToolBar Example") {

    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        layout = BorderLayout() // Use BorderLayout for better toolbar placement

        // Create the JToolBar
        val toolBar = JToolBar()
        toolBar.isFloatable = false // Prevent the toolbar from being detached

        // Create buttons for the toolbar
        val newButton = JButton(ImageIcon(javaClass.getResource("/icons/new.png"))) // Replace with your icon path
        newButton.toolTipText = "New File"

        val openButton = JButton(ImageIcon(javaClass.getResource("/icons/open.png"))) // Replace with your icon path
        openButton.toolTipText = "Open File"

        val saveButton = JButton(ImageIcon(javaClass.getResource("/icons/save.png"))) // Replace with your icon path
        saveButton.toolTipText = "Save File"

        // Add buttons to the toolbar
        toolBar.add(newButton)
        toolBar.add(openButton)
        toolBar.add(saveButton)

        // Add a separator
        toolBar.addSeparator()

        // Add other components (e.g., a combo box)
        val fontComboBox = JComboBox(arrayOf("Arial", "Calibri", "Times New Roman"))
        toolBar.add(fontComboBox)

        // Add the toolbar to the NORTH of the JFrame
        add(toolBar, BorderLayout.NORTH)

        // Add a central component (e.g., a JTextArea)
        val textArea = JTextArea()
        add(JScrollPane(textArea), BorderLayout.CENTER)

        pack()
        setSize(600, 400)
        setLocationRelativeTo(null)
        isVisible = true
    }
}

fun main() {
    SwingUtilities.invokeLater {
        ToolbarDemo()
    }
}
*/


/*
import java.awt.*
import javax.swing.*
import javax.swing.border.LineBorder

class ComponentDemo : JFrame("JComponent Example") {

    init {
        defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        layout = FlowLayout()

        // 1. JPanel (A generic container)
        val panel = JPanel()
        panel.background = Color.LIGHT_GRAY
        panel.border = LineBorder(Color.BLACK)
        panel.preferredSize = Dimension(200, 100)
        val panelLabel = JLabel("This is a JPanel")
        panel.add(panelLabel)
        add(panel)

        // 2. JLabel (Displays text or an image)
        val label = JLabel("Hello, Kotlin Swing!")
        label.foreground = Color.BLUE
        label.font = Font("Arial", Font.BOLD, 16)
        add(label)

        // 3. JButton (Triggers an action)
        val button = JButton("Click Me")
        button.addActionListener {
            JOptionPane.showMessageDialog(this, "Button clicked!")
        }
        button.toolTipText = "This button does something"
        add(button)

        // 4. JTextField (Allows single-line text input)
        val textField = JTextField(20) // 20 columns wide
        textField.text = "Initial text"
        //textField.editable = true // Can the user edit the text?
        add(textField)

        // 5. JCheckBox (A selectable option)
        val checkBox = JCheckBox("Option A")
        checkBox.isSelected = true
        add(checkBox)

        // 6. JRadioButton (A selectable option within a group)
        val radioButton1 = JRadioButton("Radio 1")
        val radioButton2 = JRadioButton("Radio 2")
        val buttonGroup = ButtonGroup() // Ensures only one radio button is selected
        buttonGroup.add(radioButton1)
        buttonGroup.add(radioButton2)
        radioButton1.isSelected = true
        add(radioButton1)
        add(radioButton2)

        // 7. JProgressBar (Visualizes progress)
        val progressBar = JProgressBar(0, 100)
        progressBar.value = 75
       // progressBar.stringPainted = true
        add(progressBar)

        pack()
        setLocationRelativeTo(null)
        isVisible = true
    }
}

fun main() {
    SwingUtilities.invokeLater {
        ComponentDemo()
    }
}
*/











