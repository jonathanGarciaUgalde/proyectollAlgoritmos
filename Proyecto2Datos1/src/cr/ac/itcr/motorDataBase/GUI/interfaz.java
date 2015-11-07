package cr.ac.itcr.motorDataBase.GUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.table.DefaultTableModel;


/**
 * Esta interfaz está basada en el modelo creado por Juan Jose Grajeda Cuesi
 * 
 * @return Sacado de la página: http://aprendiendo-software.blogspot.com/2012/01/creando-tablas.html
 * 
 */
public class interfaz extends JFrame implements ActionListener {
	DefaultListModel	dlmLista_tablas;
	JList				jlTablas;
	JToolBar			toolbar;
	JTable				jtTablaCampos;
	DefaultTableModel	dtmModelo;
	Hashtable<String, DefaultTableModel> datosTabla;
	JTextField			txtNombre	= new JTextField();
	JTextField			txtTipo		= new JTextField();
	JTextField			txtValor	= new JTextField();
	JDialog				jdAddCampo;
	JFileChooser		jfcArchivo;
	
	
	
	public interfaz(){
		setTitle( "inmemdb" );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		setLayout( new BorderLayout() );
		setSize( 525, 400 );
		setLocationRelativeTo( null );
				
		toolbar = new JToolBar();
		
		//Boton para ver el xml
		JButton btnVer = new JButton(  );
		btnVer.setName( "Ver" );
		btnVer.setToolTipText("Ver Xml");
		btnVer.addActionListener( this );
		btnVer.setIcon( new ImageIcon( getClass().getResource( "/images/xml.png" ) ) );
		toolbar.add(btnVer);
		
		//Boton para cargar xml
		JButton btnCargar = new JButton(  );
		btnCargar.setName( "Cargar" );
		btnCargar.setToolTipText("Cargar Xml");
		btnCargar.addActionListener( this );
		btnCargar.setIcon( new ImageIcon( getClass().getResource( "/images/upload.png" ) ) );
		toolbar.add( btnCargar );

		//Boton para guardar el xml
		JButton btnGuardar = new JButton(  );
		btnGuardar.setName( "Guardar" );
		btnGuardar.setToolTipText("Guardar Xml");
		btnGuardar.addActionListener( this );
		btnGuardar.setIcon( new ImageIcon( getClass().getResource( "/images/download.png" ) ) );
		toolbar.add( btnGuardar );
		
		//Boton para agregar tablas
		JButton btnAddTabla = new JButton(  );
		btnAddTabla.setName( "AddTabla" );
		btnAddTabla.setToolTipText("Agregar Tabla");
		btnAddTabla.addActionListener( this );
		btnAddTabla.setIcon( new ImageIcon( getClass().getResource( "/images/tableadd.png" ) ) );
		toolbar.add( btnAddTabla );
		
		add( toolbar, BorderLayout.NORTH );
		
		JPanel panel = new JPanel();
		panel.setLayout( null );

		//Lista de las tablas
		dlmLista_tablas	= new DefaultListModel();
		jlTablas = new JList( dlmLista_tablas );
		jlTablas.setBounds( 10, 10, 200, 300 );
		panel.add( jlTablas );
				
		add( panel, BorderLayout.CENTER );
		
		//Boton para ver la tabla seleccionada
		JButton btnVerTabla = new JButton(  );
		btnVerTabla.setName( "VerTabla" );
		btnVerTabla.setToolTipText("Ver Tabla");
		btnVerTabla.addActionListener( this );
		btnVerTabla.setIcon( new ImageIcon( getClass().getResource( "/images/ver.png" ) ) );
		btnVerTabla.setBounds( 240, 10, 32, 32 );
		panel.add( btnVerTabla );

		//Boton para agregar campos a la tabla
		JButton btnAdd = new JButton(  );
		btnAdd.setName( "AddCampo" );
		btnAdd.setToolTipText("Agregar Campo");
		btnAdd.addActionListener( this );
		btnAdd.setIcon( new ImageIcon( getClass().getResource( "/images/plus.png" ) ) );
		btnAdd.setBounds( 240, 50, 32, 32 );
		panel.add( btnAdd );
		
		//Boton para quitar campos de la tabla
		JButton btnRemove = new JButton(  );
		btnRemove.setName( "RemoveCampo" );
		btnRemove.setToolTipText("Quitar Campo");
		btnRemove.addActionListener( this );
		btnRemove.setIcon( new ImageIcon( getClass().getResource( "/images/minus.png" ) ) );
		btnRemove.setBounds( 240, 100, 32, 32 );
		panel.add( btnRemove );
		
		//Tabla para visualizar los campos
		jtTablaCampos = new JTable(  );
		JScrollPane scrollTabla = new JScrollPane( jtTablaCampos );
		scrollTabla.setBounds( 300, 10, 200, 300 );
		scrollTabla.setPreferredSize( new Dimension( 200,300 ) );
		panel.add( scrollTabla );
		
		datosTabla = new Hashtable<String, DefaultTableModel>();
		
		cargarTablas( "metadatos.xml" );
		
		this.setVisible( true );
}

	private void cargarTablas(String string) {
		// TODO Auto-generated method stub
		
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
