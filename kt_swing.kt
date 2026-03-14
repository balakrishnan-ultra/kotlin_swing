/* it's program -1 
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JButton
import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener

fun main() {
    val frame = JFrame("Kotlin Swing App")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout()


//it is display the text
    val label = JLabel("Hello, Swing!")



    //button create and clicked action code
    val button = JButton("Click Me")
    button.addActionListener(object : ActionListener
    {
        override fun actionPerformed(e: ActionEvent?)
        {
            label.text = "Button Clicked!"
        }
    })

    frame.add(label)
    frame.add(button)
    frame.pack()
    frame.isVisible = true
}

*/

//it's program -2
/* 
import java.awt.FlowLayout
import java.awt.GridLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import java.awt.event.WindowAdapter
import java.awt.event.WindowEvent
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel

class SwingK {

    private lateinit var mainFrame: JFrame
    private lateinit var headerLabel: JLabel
    private lateinit var statusLabel: JLabel
    private lateinit var controlPanel: JPanel

    init {
        prepareGUI()
    }

    private fun prepareGUI() {
        headerLabel = JLabel("", JLabel.CENTER)
        statusLabel = JLabel("", JLabel.CENTER).apply { setSize(350, 100) }

        controlPanel = JPanel().apply { layout = FlowLayout() }

        mainFrame = JFrame("Java SWING Examples").apply {
            setSize(400, 400)
            layout = GridLayout(3, 1)
            addWindowListener(object : WindowAdapter() {
                override fun windowClosing(windowEvent: WindowEvent?) {
                    System.exit(0)
                }
            })
            add(headerLabel)
            add(controlPanel)
            add(statusLabel)
            isVisible = true
        }
    }

    internal fun showEventDemo() {
        headerLabel.text = "Control in action: Button"

        val okButton = JButton("OK").apply {
            actionCommand = "OK"
            addActionListener(ButtonClickListener())
        }
        val submitButton = JButton("Submit").apply {
            actionCommand = "Submit"
            addActionListener(ButtonClickListener())
        }
        val cancelButton = JButton("Cancel").apply {
            actionCommand = "Cancel"
            addActionListener(ButtonClickListener())
        }

        controlPanel.add(okButton)
        controlPanel.add(submitButton)
        controlPanel.add(cancelButton)

        mainFrame.isVisible = true
    }

    private inner class ButtonClickListener : ActionListener {
        override fun actionPerformed(e: ActionEvent) {
            statusLabel.text = when (e.actionCommand) {
                "OK" -> "Ok Button clicked."
                "Submit" -> "Submit Button clicked."
                else -> "Cancel Button clicked."
            }
        }
    }
}

fun main(args: Array<String>) {
    val swingControlDemo = SwingK()
    swingControlDemo.showEventDemo()
}

*/




/* 
//radio button kotlin code
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
    val frame = JFrame("Swing Radio Button Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout()

    // Create a ButtonGroup to ensure only one radio button is selected at a time
    val group = ButtonGroup()

    // Create the radio buttons
    val radioButton1 = JRadioButton("Option 1")
    val radioButton2 = JRadioButton("Option 2")
    val radioButton3 = JRadioButton("Option 3")

    // Add the radio buttons to the ButtonGroup
    group.add(radioButton1)
    group.add(radioButton2)
    group.add(radioButton3)

    // Add the radio buttons to the frame
    frame.add(radioButton1)
    frame.add(radioButton2)
    frame.add(radioButton3)

    // Add an ActionListener to each radio button (optional)
    val listener = ActionListener { e ->
        val selectedOption = (e.source as JRadioButton).text
        println("Selected option: $selectedOption")
    }
    radioButton1.addActionListener(listener)
    radioButton2.addActionListener(listener)
    radioButton3.addActionListener(listener)

    frame.pack()
    frame.isVisible = true
}
*/





/* 
Explanation:

import javax.swing.* and import java.awt.*: These lines import the necessary Swing and AWT (Abstract Window Toolkit) classes.
fun main() { ... }: This is the entry point of your Kotlin application.
SwingUtilities.invokeLater { ... }: This ensures that the Swing UI is created and updated on the Event Dispatch Thread (EDT). This is crucial for thread safety in Swing applications.
fun createAndShowGUI() { ... }: This function contains the code to create and display the Swing components.
val frame = JFrame("Swing Radio Button Example"): Creates the main window of the application with a title.
frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE: Sets the default behavior when the user closes the window (in this case, the application will exit).
frame.layout = FlowLayout(): Sets the layout manager for the frame. FlowLayout arranges components in a left-to-right flow.
val group = ButtonGroup(): This is the key element for radio buttons. ButtonGroup manages a set of buttons, ensuring that only one button within the group can be selected at any given time.
val radioButton1 = JRadioButton("Option 1"): Creates a JRadioButton with the label "Option 1". You can create as many radio buttons as you need.
group.add(radioButton1): Adds the created radio button to the ButtonGroup. This is what links the buttons together so that only one can be selected.
frame.add(radioButton1): Adds the radio button to the frame so it's visible in the window.
val listener = ActionListener { e -> ... }: This creates an ActionListener. An ActionListener is an interface that defines a method (actionPerformed) which is called when an action event occurs (like clicking a button).
(e.source as JRadioButton).text: Inside the actionPerformed method, e.source gives you the component that triggered the event (in this case, the clicked JRadioButton). We cast it to JRadioButton to access its text property (the label).
radioButton1.addActionListener(listener): Attaches the ActionListener to the radio button. Now, whenever this radio button is clicked (and becomes selected), the actionPerformed method will be executed.
frame.pack(): Sizes the frame to fit its contents.
frame.isVisible = true: Makes the frame visible to the user.
To run this code:

Set up a Kotlin project: If you don't have one already, create a new Kotlin project in your IDE (like IntelliJ IDEA).
Add the Kotlin standard library: Ensure your project has the Kotlin standard library dependency.
Create a .kt file: Create a Kotlin file (e.g., RadioButtonExample.kt) and paste the code into it.
Run the application: Run the main function. This should open a window with three radio buttons, where only one can be selected at a time. Clicking a radio button will print the selected option to the console.
Keep in mind that while Swing is functional, it's an older UI toolkit. For modern Kotlin desktop development, you might consider more contemporary frameworks like JavaFX (which has good Kotlin support through TornadoFX) or Compose for Desktop.


*/

/* 
//this program is error
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
    val frame = JFrame("Swing TextField Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout()

    // Create a JTextField
    val textField = JTextField(20) // 20 is the preferred width in columns

    // Create a button to get the text from the TextField
    val button = JButton("Get Text")

    // Create a JLabel to display the text
    val label = JLabel("Text entered: ")

    // Add an ActionListener to the button
    button.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            val text = textField.text
            label.text = "Text entered: $text"
        }
    })

    // Add the TextField, Button, and Label to the frame
    frame.add(textField)
    frame.add(button)
    frame.add(label)

    frame.pack()
    frame.isVisible = true
}*/

/* 
//error 
//text area
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
    val frame = JFrame("Swing JTextArea Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = BorderLayout() // Use BorderLayout for better control

    // Create a JTextArea with initial dimensions (rows, columns)
    val textArea = JTextArea(5, 20)
    textArea.lineWrap = true // Enable line wrapping
    textArea.wrapStyleWord = true // Wrap at word boundaries

    // Create a JScrollPane to make the JTextArea scrollable if the text exceeds the visible area
    val scrollPane = JScrollPane(textArea)

    // Create a button to get the text from the JTextArea
    val getTextButton = JButton("Get Text")

    // Create a JLabel to display the text
    val textLabel = JLabel("Text in Area: ")

    // Create a button to set some text in the JTextArea
    val setTextButton = JButton("Set Text")

    // Add ActionListener to the "Get Text" button
    getTextButton.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            val text = textArea.text
            textLabel.text = "Text in Area: $text"
        }
    })

    // Add ActionListener to the "Set Text" button
    setTextButton.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            textArea.text = "This is some sample text set programmatically."
        }
    })

    // Create a JPanel to hold the buttons
    val buttonPanel = JPanel(FlowLayout(FlowLayout.CENTER))
    buttonPanel.add(getTextButton)
    buttonPanel.add(setTextButton)

    // Add the JScrollPane (containing the JTextArea) to the center
    frame.add(scrollPane, BorderLayout.CENTER)
    // Add the button panel to the south
    frame.add(buttonPanel, BorderLayout.SOUTH)
    // Add the label to the north
    frame.add(textLabel, BorderLayout.NORTH)

    frame.pack()
    frame.isVisible = true
} */


//checkbox error
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
    val frame = JFrame("Swing JCheckBox Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout()

    // Create the JCheckBoxes
    val checkBox1 = JCheckBox("Option A")
    val checkBox2 = JCheckBox("Option B")
    val checkBox3 = JCheckBox("Option C", true) // 'true' makes it initially selected

    // Create a JLabel to display the state of the checkboxes
    val statusLabel = JLabel("Selected: ")

    // Add ItemListeners to the JCheckBoxes (more common for checkboxes)
    val itemListener = object : ItemListener {
        override fun itemStateChanged(e: ItemEvent) {
            val source = e.itemSelectable as JCheckBox
            val isChecked = e.stateChange == ItemEvent.SELECTED
            println("${source.text} checked: $isChecked")
            updateStatusLabel(checkBox1, checkBox2, checkBox3, statusLabel)
        }
    }
    checkBox1.addItemListener(itemListener)
    checkBox2.addItemListener(itemListener)
    checkBox3.addItemListener(itemListener)

    // Alternatively, you can use ActionListeners (triggered when the state changes)
    /*
    val actionListener = ActionListener { e ->
        val source = e.source as JCheckBox
        println("${source.text} action performed. State: ${source.isSelected}")
        updateStatusLabel(checkBox1, checkBox2, checkBox3, statusLabel)
    }
    checkBox1.addActionListener(actionListener)
    checkBox2.addActionListener(actionListener)
    checkBox3.addActionListener(actionListener)
    

    // Add the JCheckBoxes and the JLabel to the frame
    frame.add(checkBox1)
    frame.add(checkBox2)
    frame.add(checkBox3)
    frame.add(statusLabel)

    frame.pack()
    frame.isVisible = true
}

fun updateStatusLabel(cb1: JCheckBox, cb2: JCheckBox, cb3: JCheckBox, label: JLabel) {
    val selectedOptions = mutableListOf<String>()
    if (cb1.isSelected) selectedOptions.add(cb1.text)
    if (cb2.isSelected) selectedOptions.add(cb2.text)
    if (cb3.isSelected) selectedOptions.add(cb3.text)

    label.text = "Selected: ${selectedOptions.joinToString(", ")}"
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


fun createAndShowGUI() {
    val frame = JFrame("Swing JComboBox Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout()

    // Create an array of items for the JComboBox
    val items = arrayOf("Apple", "Banana", "Cherry", "Date", "Elderberry")

    // Create the JComboBox
    val comboBox = JComboBox(items)
    comboBox.selectedIndex = 0 // Set the initially selected item (optional)

    // Create a JLabel to display the selected item
    val selectionLabel = JLabel("Selected: ${comboBox.selectedItem}")

    // Add an ActionListener (triggered when the user makes a selection)
    comboBox.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            if (e?.source == comboBox) {
                val selectedItem = comboBox.selectedItem
                selectionLabel.text = "Selected: $selectedItem"
                println("Action performed: Selected item is $selectedItem")
            }
        }
    })

    // Alternatively, you can use an ItemListener (triggered even if the selection doesn't change due to programmatic setting)
    /*
    comboBox.addItemListener(object : ItemListener {
        override fun itemStateChanged(e: ItemEvent?) {
            if (e?.source == comboBox && e.stateChange == ItemEvent.SELECTED) {
                val selectedItem = comboBox.selectedItem
                println("Item state changed: Selected item is $selectedItem")
            }
        }
    })
    

    // Add the JComboBox and the JLabel to the frame
    frame.add(comboBox)
    frame.add(selectionLabel)

    frame.pack()
    frame.isVisible = true
}
}*/

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
        arrayOf("John", "Doe", 30),
        arrayOf("Jane", "Smith", 25),
        arrayOf("Peter", "Jones", 40),
        arrayOf("Alice", "Brown", 22)
    )

    // Column headers for the table
    val columnNames = arrayOf("First Name", "Last Name", "Age")

    // Create a DefaultTableModel to hold the data and column names
    val tableModel = DefaultTableModel(data, columnNames)

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
import javax.swing.JOptionPane

fun main() {
    // 1. Simple Message Dialog
    JOptionPane.showMessageDialog(null, "This is a simple message.", "Information", JOptionPane.INFORMATION_MESSAGE)

    // 2. Confirmation Dialog (Yes/No/Cancel)
    val confirmationResult = JOptionPane.showConfirmDialog(
        null,
        "Are you sure you want to proceed?",
        "Confirmation",
        JOptionPane.YES_NO_CANCEL_OPTION
    )
    when (confirmationResult) {
        JOptionPane.YES_OPTION -> println("User clicked Yes")
        JOptionPane.NO_OPTION -> println("User clicked No")
        JOptionPane.CANCEL_OPTION -> println("User clicked Cancel")
        JOptionPane.CLOSED_OPTION -> println("Dialog was closed without a selection")
    }

    */






/* 
    // 3. Input Dialog (Text Field)
    val name = JOptionPane.showInputDialog(null, "Enter your name:", "Input", JOptionPane.QUESTION_MESSAGE)
    if (!name.isNullOrEmpty()) {
        println("User entered: $name")
    } else {
        println("User cancelled or entered nothing for name")
    }

    // 4. Input Dialog (Combo Box/Dropdown)
    val options = arrayOf("Option A", "Option B", "Option C")
    val selectedOption = JOptionPane.showInputDialog(
        null,
        "Choose an option:",
        "Dropdown Selection",
        JOptionPane.QUESTION_MESSAGE,
        null, // Use default icon
        options,
        options[0] // Initial selection
    )
    if (selectedOption != null) {
        println("User selected: $selectedOption")
    } else {
        println("User cancelled the dropdown selection")
    }

    // 5. Warning Message Dialog
    JOptionPane.showMessageDialog(null, "Be careful!", "Warning", JOptionPane.WARNING_MESSAGE)

    // 6. Error Message Dialog
    JOptionPane.showMessageDialog(null, "An error has occurred.", "Error", JOptionPane.ERROR_MESSAGE)

    // 7. Custom Icon Message Dialog
    val customIcon = ImageIcon(javaClass.getResource("/kotlin_logo.png")) // Replace with your actual icon path
    if (customIcon.image != null) {
        JOptionPane.showMessageDialog(null, "This message uses a custom icon.", "Custom Icon", JOptionPane.INFORMATION_MESSAGE, customIcon)
    } else {
        println("Custom icon not found. Skipping custom icon example.")
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
    val frame = JFrame("Swing JScrollBar Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout()

    // Create a JLabel to display the scrollbar value
    val label = JLabel("Scrollbar Value: 0")

    // Create a JScrollBar (vertical by default)
    val verticalScrollBar = JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 100)
    verticalScrollBar.unitIncrement = 10 // How much the value changes on a small scroll
    verticalScrollBar.blockIncrement = 20 // How much the value changes on a large scroll

    // Add a listener to the vertical scrollbar
    verticalScrollBar.addAdjustmentListener { e ->
        label.text = "Scrollbar Value: ${e.value}"
    }

    // Create a horizontal JScrollBar
    val horizontalScrollBar = JScrollBar(JScrollBar.HORIZONTAL, 50, 20, 0, 200)
    horizontalScrollBar.unitIncrement = 5
    horizontalScrollBar.blockIncrement = 15

    // Add a listener to the horizontal scrollbar
    horizontalScrollBar.addAdjustmentListener { e ->
        println("Horizontal Scrollbar Value: ${e.value}")
    }

    // Add the label and scrollbars to the frame
    frame.add(label)
    frame.add(verticalScrollBar)
    frame.add(horizontalScrollBar)

    frame.pack()
    frame.isVisible = true
}*/

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
    val frame = JFrame("Swing JToggleButton Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout()

    // Create a JToggleButton
    val toggleButton = JToggleButton("Toggle Me")

    // Create a JLabel to display the toggle button's state
    val stateLabel = JLabel("State: Unselected")

    // Add an ActionListener (triggered when the button is pressed or released)
    toggleButton.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            val isSelected = toggleButton.isSelected
            stateLabel.text = "State: ${if (isSelected) "Selected" else "Unselected"}"
            println("Action performed. Button selected: $isSelected")
        }
    })

    // Alternatively, you can use an ItemListener (triggered when the selection state changes)
    /*
    toggleButton.addItemListener(object : ItemListener {
        override fun itemStateChanged(e: ItemEvent?) {
            val isSelected = e?.stateChange == ItemEvent.SELECTED
            stateLabel.text = "State: ${if (isSelected) "Selected" else "Unselected"}"
            println("Item state changed. Button selected: $isSelected")
        }
    })


    // Add the toggle button and the label to the frame
    frame.add(toggleButton)
    frame.add(stateLabel)

    frame.pack()
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
    val frame = JFrame("Swing JToggleButton Example")
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.layout = FlowLayout()

    // Create a JToggleButton
    val toggleButton = JToggleButton("Toggle Me")

    // Create a JLabel to display the toggle button's state
    val stateLabel = JLabel("State: Unselected")

    // Add an ActionListener (triggered when the button is pressed or released)
    toggleButton.addActionListener(object : ActionListener {
        override fun actionPerformed(e: ActionEvent?) {
            val isSelected = toggleButton.isSelected
            stateLabel.text = "State: ${if (isSelected) "Selected" else "Unselected"}"
            println("Action performed. Button selected: $isSelected")
        }
    })

    // Alternatively, you can use an ItemListener (triggered when the selection state changes)
    /*
    toggleButton.addItemListener(object : ItemListener {
        override fun itemStateChanged(e: ItemEvent?) {
            val isSelected = e?.stateChange == ItemEvent.SELECTED
            stateLabel.text = "State: ${if (isSelected) "Selected" else "Unselected"}"
            println("Item state changed. Button selected: $isSelected")
        }
    })
    

    // Add the toggle button and the label to the frame
    frame.add(toggleButton)
    frame.add(stateLabel)

    frame.pack()
    frame.isVisible = true
}
*/

import javax.swing.*
import java.awt.*
import java.awt.event.ActionEvent.*
import java.awt.event.ActionListener.*
import javax.swing.event.ChangeEvent.*
import javax.swing.event.ChangeListener.*  
fun main() 
{

    SwingUtilities.invokeLater 
    {
        createAndShowGUI()
    }
}
    
fun createAndShowGUI() 
{
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
    button.addActionListener
    {
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
    slider.addChangeListener 
    { e -> val source = e.source as JSlider
            if (!source.getValueIsAdjusting()) 
            {
                println("Slider value: ${source.value}")
            }
    }
    frame.add(JLabel("JSlider:"))
    frame.add(slider)
    
        // JProgressBar
    val progressBar = JProgressBar(0, 100)
    progressBar.value = 75
    //progressBar.stringPainted = true
    frame.add(JLabel("JProgressBar:"))
    frame.add(progressBar)
    
        // JToggleButton
    val toggleButton = JToggleButton("Toggle")
    toggleButton.addActionListener 
    {
        println("Toggle Button state: ${toggleButton.isSelected}")
    }
    frame.add(JLabel("JToggleButton:"))
    frame.add(toggleButton)
    frame.pack()
    frame.isVisible = true
}