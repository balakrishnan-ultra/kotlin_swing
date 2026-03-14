import javax.swing.*
import javax.swing.border.LineBorder
import java.awt.Color

fun main() {
    val frame = JFrame("Color Change Example")
    
    val panel = JPanel()
    // Set a red border with a thickness of 5 pixels
    //panel.border = LineBorder(Color.RED, 25)





    //adding border factory . it's kotlin friendly'
    // A thin blue border
panel.border = BorderFactory.createLineBorder(Color.BLUE)

// A thicker green border
panel.border = BorderFactory.createLineBorder(Color.GREEN, 30)

// A rounded border (only available in some Look-and-Feels)
panel.border = BorderFactory.createLineBorder(Color.MAGENTA, 20, true)
    





//adding title border color
val titledBorder = BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.ORANGE, 5), "Settings Group")
titledBorder.titleColor = Color.ORANGE
panel.border = titledBorder










    frame.contentPane = panel
    frame.setSize(400, 300)
    frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
    frame.isVisible = true
}
