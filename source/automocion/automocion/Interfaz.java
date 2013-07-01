package automocion;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import jclips.JClips;
import java.awt.Dimension;

public class Interfaz extends JFrame implements Observer {
	
	private static final String KNOWLEDGE_FILE = "source.clp";
	
	private static JClips jClips;  //  @jve:decl-index=0:

	private static final long serialVersionUID = 1L;

	private JPanel jContentPane = null;

	private JPanel jPanel = null;

	private JTextField jTextField = null;

	private JTextField jTextField1 = null;

	private JButton jButton = null;

	private JButton jButton1 = null;

	private JTextField jTextFieldEdad = null;

	private JTextField jTextFieldPoder = null;

	private JTextField jTextFieldUso = null;

	private JTextField jTextFieldSitio = null;

	private JTextField jTextFieldPotencia = null;

	private JTextField jTextFieldExtras = null;

	private JTextField jTextFieldUtilidad = null;

	private JComboBox jComboBoxEdad = null;

	private JComboBox jComboBoxPoder = null;

	private JComboBox jComboBoxUso = null;

	private JComboBox jComboBoxSitio = null;

	private JComboBox jComboBoxPotencia = null;

	private JComboBox jComboBoxExtras = null;

	private JComboBox jComboBoxUtilidad = null;
	
	static String[] opcionesEdad={"Joven","Mayor","Viejo"};
	
	static String[] opcionesTipico={"Bajo","Medio","Alto"};
	
	static String[] opcionesPotencia={"Baja","Media","Alta"};
	
	static String[] opcionesExtras={"Pocos", "Normal", "Muchos"};
	
	static String[] opcionesOcupacion={"Profesional", "Particular"};
	
	static String[] opcionesSitio={"Ciudad","Campo"};
	

	public static JTextArea jTextArea = null;
	
	static JScrollPane jScrollPane = null;
	private ListaCoches listaCoches = new ListaCoches();  //  @jve:decl-index=0:

	/**
	 * This is the default constructor
	 */
	public Interfaz() {
		super();
		initialize();
	}

	/**
	 * This method initializes this
	 * 
	 * @return void
	 */
	private void initialize() {
		this.setSize(692, 539);
		this.setContentPane(getJContentPane());
		this.setTitle("Sistema de ayuda para las venta de coches");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 * This method initializes jContentPane
	 * 
	 * @return javax.swing.JPanel
	 */
	private JPanel getJContentPane() {
		if (jContentPane == null) {
			jContentPane = new JPanel();
			jContentPane.setLayout(new BorderLayout());
			jContentPane.add(getJPanel(), BorderLayout.CENTER);
		}
		return jContentPane;
	}

	/**
	 * This method initializes jPanel	
	 * 	
	 * @return javax.swing.JPanel	
	 */
	private JPanel getJPanel() {
		if (jPanel == null) {
			jPanel = new JPanel();
			jPanel.setLayout(null);
			jPanel.add(getJTextField(), null);
			jPanel.add(getJTextField1(), null);
			jPanel.add(getJButton(), null);
			jPanel.add(getJButton1(), null);
			jPanel.add(getJTextFieldEdad(), null);
			jPanel.add(getJTextFieldPoder(), null);
			jPanel.add(getJTextFieldUso(), null);
			jPanel.add(getJTextFieldSitio(), null);
			jPanel.add(getJTextFieldPotencia(), null);
			jPanel.add(getJTextFieldExtras(), null);
			jPanel.add(getJTextFieldUtilidad(), null);
			jPanel.add(getJComboBoxEdad(), null);
			jPanel.add(getJComboBoxPoder(), null);
			jPanel.add(getJComboBoxUso(), null);
			jPanel.add(getJComboBoxSitio(), null);
			jPanel.add(getJComboBoxPotencia(), null);
			jPanel.add(getJComboBoxExtras(), null);
			jPanel.add(getJComboBoxUtilidad(), null);
			jPanel.add(getJTextArea(), null);
			jPanel.add(getJScrollPane(), null);
			
			
		}
		return jPanel;
	}

	/**
	 * This method initializes jTextField	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField() {
		if (jTextField == null) {
			jTextField = new JTextField();
			jTextField.setBounds(new Rectangle(27, 14, 155, 19));
			jTextField.setText("Propiedades del cliente");
		}
		return jTextField;
	}

	/**
	 * This method initializes jTextField1	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setBounds(new Rectangle(371, 14, 155, 19));
			jTextField1.setText("Propiedades del coche");
		}
		return jTextField1;
	}

	/**
	 * This method initializes jButton	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton() {
		if (jButton == null) {
			jButton = new JButton();
			jButton.setBounds(new Rectangle(39, 157, 119, 29));
			jButton.setText("Buscar");
			jButton.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					// Creamos un cliente y pedimos su lista de coches
					// Sacamos los valores
					String edad = opcionesEdad[jComboBoxEdad.getSelectedIndex()];
					String poderAdquisitivo = opcionesTipico[jComboBoxPoder.getSelectedIndex()];
					String uso = opcionesTipico[jComboBoxUso.getSelectedIndex()];
					String sitio = opcionesSitio[jComboBoxSitio.getSelectedIndex()];;
					String potencia = opcionesPotencia[jComboBoxPotencia.getSelectedIndex()];
					String extras = opcionesExtras[jComboBoxExtras.getSelectedIndex()];
					String ocupacion = opcionesOcupacion[jComboBoxUtilidad.getSelectedIndex()];;
					Cliente cliente = new Cliente(edad,poderAdquisitivo,uso,sitio,potencia,extras,ocupacion);
					dameListaCoches(cliente);
					
				}
			});
		}
		return jButton;
	}

	/**
	 * This method initializes jButton1	
	 * 	
	 * @return javax.swing.JButton	
	 */
	private JButton getJButton1() {
		if (jButton1 == null) {
			jButton1 = new JButton();
			jButton1.setBounds(new Rectangle(182, 157, 119, 29));
			jButton1.setText("Limpiar");
			jButton1.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent e) {
					jTextArea.setText("");
				}
			});
		}
		return jButton1;
	}

	/**
	 * This method initializes jTextFieldEdad	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldEdad() {
		if (jTextFieldEdad == null) {
			jTextFieldEdad = new JTextField();
			jTextFieldEdad.setBounds(new Rectangle(13, 50, 110, 20));
			jTextFieldEdad.setText("Edad");
			jTextFieldEdad.setHorizontalAlignment(JTextField.RIGHT);
		}
		return jTextFieldEdad;
	}

	/**
	 * This method initializes jTextFieldPoder	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPoder() {
		if (jTextFieldPoder == null) {
			jTextFieldPoder = new JTextField();
			jTextFieldPoder.setBounds(new Rectangle(13, 75, 110, 20));
			jTextFieldPoder.setText("Poder adquisitivo");
			jTextFieldPoder.setHorizontalAlignment(JTextField.RIGHT);
		}
		return jTextFieldPoder;
	}

	/**
	 * This method initializes jTextFieldUso	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldUso() {
		if (jTextFieldUso == null) {
			jTextFieldUso = new JTextField();
			jTextFieldUso.setBounds(new Rectangle(388, 50, 110, 20));
			jTextFieldUso.setText("Uso");
			jTextFieldUso.setHorizontalAlignment(JTextField.RIGHT);
		}
		return jTextFieldUso;
	}

	/**
	 * This method initializes jTextFieldSitio	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldSitio() {
		if (jTextFieldSitio == null) {
			jTextFieldSitio = new JTextField();
			jTextFieldSitio.setBounds(new Rectangle(388, 75, 110, 20));
			jTextFieldSitio.setText("Sitio");
			jTextFieldSitio.setHorizontalAlignment(JTextField.RIGHT);
		}
		return jTextFieldSitio;
	}

	/**
	 * This method initializes jTextFieldPotencia	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldPotencia() {
		if (jTextFieldPotencia == null) {
			jTextFieldPotencia = new JTextField();
			jTextFieldPotencia.setBounds(new Rectangle(388, 100, 110, 20));
			jTextFieldPotencia.setText("Potencia");
			jTextFieldPotencia.setHorizontalAlignment(JTextField.RIGHT);
		}
		return jTextFieldPotencia;
	}

	/**
	 * This method initializes jTextFieldExtras	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldExtras() {
		if (jTextFieldExtras == null) {
			jTextFieldExtras = new JTextField();
			jTextFieldExtras.setBounds(new Rectangle(388, 125, 110, 20));
			jTextFieldExtras.setText("Extras");
			jTextFieldExtras.setHorizontalAlignment(JTextField.RIGHT);
		}
		return jTextFieldExtras;
	}

	/**
	 * This method initializes jTextFieldUtilidad	
	 * 	
	 * @return javax.swing.JTextField	
	 */
	private JTextField getJTextFieldUtilidad() {
		if (jTextFieldUtilidad == null) {
			jTextFieldUtilidad = new JTextField();
			jTextFieldUtilidad.setBounds(new Rectangle(388, 150, 110, 20));
			jTextFieldUtilidad.setText("Utilidad");
			jTextFieldUtilidad.setHorizontalAlignment(JTextField.RIGHT);
		}
		return jTextFieldUtilidad;
	}

	/**
	 * This method initializes jComboBoxEdad	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxEdad() {
		if (jComboBoxEdad == null) {
			jComboBoxEdad = new JComboBox(opcionesEdad);
			jComboBoxEdad.setBounds(new Rectangle(125, 50, 100, 20));
		}
		return jComboBoxEdad;
	}

	/**
	 * This method initializes jComboBoxPoder	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxPoder() {
		if (jComboBoxPoder == null) {
			jComboBoxPoder = new JComboBox(opcionesTipico);
			jComboBoxPoder.setBounds(new Rectangle(125, 75, 100, 20));
		}
		return jComboBoxPoder;
	}

	/**
	 * This method initializes jComboBoxUso	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxUso() {
		if (jComboBoxUso == null) {
			jComboBoxUso = new JComboBox(opcionesTipico);
			jComboBoxUso.setBounds(new Rectangle(500, 50, 100, 20));
		}
		return jComboBoxUso;
	}

	/**
	 * This method initializes jComboBoxSitio	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxSitio() {
		if (jComboBoxSitio == null) {
			jComboBoxSitio = new JComboBox(opcionesSitio);
			jComboBoxSitio.setBounds(new Rectangle(500, 75, 100, 20));
		}
		return jComboBoxSitio;
	}

	/**
	 * This method initializes jComboBoxPotencia	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxPotencia() {
		if (jComboBoxPotencia == null) {
			jComboBoxPotencia = new JComboBox(opcionesPotencia);
			jComboBoxPotencia.setBounds(new Rectangle(500, 100, 100, 20));
		}
		return jComboBoxPotencia;
	}

	/**
	 * This method initializes jComboBoxExtras	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxExtras() {
		if (jComboBoxExtras == null) {
			jComboBoxExtras = new JComboBox(opcionesExtras);
			jComboBoxExtras.setBounds(new Rectangle(500, 125, 100, 20));
		}
		return jComboBoxExtras;
	}

	/**
	 * This method initializes jComboBoxUtilidad	
	 * 	
	 * @return javax.swing.JComboBox	
	 */
	private JComboBox getJComboBoxUtilidad() {
		if (jComboBoxUtilidad == null) {
			jComboBoxUtilidad = new JComboBox(opcionesOcupacion);
			jComboBoxUtilidad.setBounds(new Rectangle(500, 150, 100, 20));
		}
		return jComboBoxUtilidad;
	}

	/**
	 * This method initializes jTextArea	
	 * 	
	 * @return javax.swing.JTextArea	
	 */
	public static JTextArea getJTextArea() {
		if (jTextArea == null) {
			jTextArea = new JTextArea();
			jTextArea.setBounds(new Rectangle(17, 196, 644, 300));
		}
		return jTextArea;
	}
	
	public void pintaCoche(int i){
		i--;
		Coche coche = listaCoches.dameCoche(i);		
		jTextArea.append("Nombre:"+ coche.getMarca() + "\n");
		jTextArea.append("Caja de cambios:"+ coche.getCaja() + "\n");
		jTextArea.append("Carroceria: "+ coche.getCarroceria() + "\n");
		jTextArea.append("Combustible:"+ coche.getCombustible() + "\n");
		jTextArea.append("Potencia:"+ coche.getPotencia() + "\n");
		jTextArea.append("Precio:"+ coche.getPrecio() + "\n");
		jTextArea.append("Motor:"+ coche.getMotor() + "\n");
		jTextArea.append("\n");
	}
	
	public static void setTexto(String texto){
		jTextArea.append(texto);
	}
	
    public void update(Observable jClips, Object messageObj) {
        String message = messageObj.toString();
        int car = Integer.parseInt(message);
        pintaCoche(car);
    }
    
	public void dameListaCoches(Cliente cliente){
		System.out.println(JClips.getVersion());
		
  		jClips = JClips.getInstance();
    	jClips.init();
    	jClips.addObserver(this);
    	
    	try {
            URL fileUrl = Interfaz.class.getResource(KNOWLEDGE_FILE);
            if (fileUrl == null) {
                throw new FileNotFoundException(KNOWLEDGE_FILE);
            }
            File file = new File(new URI(fileUrl.toString()));
            jClips.load(file.getPath());
            jClips.reset();            
            String clienteClips;
            clienteClips = "(assert "
            		+ "(cliente (edad " + cliente.getEdad().toLowerCase() + ")"
            		+ "(extras " + cliente.getExtras().toLowerCase() + ")"
            		+ "(ocupacion " +cliente.getOcupacion().toLowerCase() + ")"
            		+ "(poderAdquisitivo " + cliente.getPoderAdquisitivo().toLowerCase() + ")"
            		+ "(potenciaCliente " + cliente.getPotencia().toLowerCase() + ")"
            		+ "(sitio " + cliente.getSitio().toLowerCase() + ")"
            		+ "(uso " + cliente.getUso().toLowerCase() + ")))";
            System.out.println("Se meten estos datos:");
            System.out.println(clienteClips);
            jClips.executeCommand(clienteClips);        
            jClips.run();
            jClips.reset();
        } catch (Exception e) {
            e.printStackTrace(System.err);
        }
	}

	/**
	 * This method initializes jScrollPane	
	 * 	
	 * @return javax.swing.JScrollPane	
	 */
	private JScrollPane getJScrollPane() {
		if (jScrollPane == null) {
			jScrollPane = new JScrollPane();
			jScrollPane.setBounds(new Rectangle(17, 196, 644, 300));
			jScrollPane.setViewportView(jTextArea);
		}
		return jScrollPane;
	}



}  //  @jve:decl-index=0:visual-constraint="46,34"
