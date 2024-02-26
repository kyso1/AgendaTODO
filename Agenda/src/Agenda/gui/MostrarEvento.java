package Agenda.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.AbstractDocument;
import javax.swing.text.BoxView;
import javax.swing.text.ComponentView;
import javax.swing.text.Element;
import javax.swing.text.IconView;
import javax.swing.text.LabelView;
import javax.swing.text.ParagraphView;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;
import javax.swing.JTextPane;

public class MostrarEvento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MostrarEvento frame = new MostrarEvento();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	JTextPane textPane = new JTextPane();
	public MostrarEvento() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//JTextPane textPane = new JTextPane();
		textPane.setBounds(10, 10, 414, 240);
		textPane.setEditorKit(new WrapEditorKit());
		contentPane.add(textPane);
	}

	public void setTexto(String texto) {
		textPane.setText(texto);
	}
	
}



//Classes abaixo para fazer a formatação do texto;
class WrapEditorKit extends StyledEditorKit {
	private static final long serialVersionUID = 1L;
	ViewFactory defaultFactory = new WrapColumnFactory();

  public ViewFactory getViewFactory() {
      return defaultFactory;
  }
}

class WrapColumnFactory implements ViewFactory {
  public View create(Element elem) {
      String kind = elem.getName();
      if (kind != null) {
          if (kind.equals(AbstractDocument.ContentElementName)) {
              return new WrapLabelView(elem);
          } else if (kind.equals(AbstractDocument.ParagraphElementName)) {
              return new ParagraphView(elem);
          } else if (kind.equals(AbstractDocument.SectionElementName)) {
              return new BoxView(elem, View.Y_AXIS);
          } else if (kind.equals(StyleConstants.ComponentElementName)) {
              return new ComponentView(elem);
          } else if (kind.equals(StyleConstants.IconElementName)) {
              return new IconView(elem);
          }
      }

      return new LabelView(elem);
  }
}

class WrapLabelView extends LabelView {
  public WrapLabelView(Element elem) {
      super(elem);
  }

  public float getMinimumSpan(int axis) {
      switch (axis) {
          case View.X_AXIS:
              return 0;
          case View.Y_AXIS:
              return super.getMinimumSpan(axis);
          default:
              throw new IllegalArgumentException("Invalid axis: " + axis);
      }
  }
}
