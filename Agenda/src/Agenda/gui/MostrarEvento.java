package Agenda.gui;

import javax.swing.JPanel;
import javax.swing.SpringLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
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
import javax.swing.JScrollPane;

public class MostrarEvento extends JScrollPane {

	private static final long serialVersionUID = 1L;

	/**
	 * Create the panel.
	 */
	
	public String texto;
	JTextPane txtpnTextDesc = new JTextPane();
	public MostrarEvento() {
		
		txtpnTextDesc.setEditable(false);
		setViewportView(txtpnTextDesc);
		txtpnTextDesc.setEditorKit(new WrapEditorKit());
		
		JLabel lblNewLabel = new JLabel("Descrição:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		setColumnHeaderView(lblNewLabel);
		
		txtpnTextDesc.setText(texto);

	}
	
	public void setTexto(String texto) {
		this.texto = texto;
		txtpnTextDesc.setText(texto);
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