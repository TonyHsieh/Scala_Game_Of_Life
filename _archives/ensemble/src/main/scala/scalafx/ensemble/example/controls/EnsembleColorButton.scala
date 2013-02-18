package scalafx.ensemble.example.controls

import scalafx.Includes._
import scalafx.ensemble.commons.EnsembleExample
import scalafx.geometry.Insets
import scalafx.scene.Node
//import scalafx.scene.Node.sfxNode2jfx
import scalafx.scene.control.Button
import scalafx.scene.image.Image
//import scalafx.scene.image.Image.sfxImage2jfx
import scalafx.scene.image.ImageView
import scalafx.scene.layout.VBox
import scalafx.scene.text.Font
import scalafx.scene.text.Text

class EnsembleColorButton extends EnsembleExample {
  def getContent = {
    new VBox {
      vgrow = javafx.scene.layout.Priority.ALWAYS
      hgrow = javafx.scene.layout.Priority.ALWAYS
      spacing = 10
      margin = Insets(50, 0, 0, 50)
      content = List(
        new Text {
          text = "Ensemble Color Buttons"
          font = new Font("Verdana", 20)
        },
        new Button {
          maxWidth = 200
          maxHeight = 150
          text = "Color Button 1"
          style = "-fx-base: red"
        },
        new Button {
          maxWidth = 200
          maxHeight = 150
          text = "Color Button 2"
          style = "-fx-base: green "
        },
        new Button {
          maxWidth = 200
          maxHeight = 150
          text = "Color Button 3"
          style = "-fx-base: Yellow"
        },
        new Button {
          maxWidth = 200
          maxHeight = 150
          text = "Color Button 4"
          style = "-fx-base: Orange"
        })
    }
  }
}