import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Composite;

import java.security.acl.LastOwnerException;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.wb.swt.SWTResourceManager;

public class CalculadoraGrafica {

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = new Shell();
		shell.setSize(450, 300);
		shell.setText("SWT Application");
		
		Composite composite = new Composite(shell, SWT.NONE);
		composite.setBounds(10, 10, 414, 28);
		
		Label lblVentanados = new Label(composite, SWT.NONE);
		lblVentanados.setBounds(10, 0, 394, 25);
		lblVentanados.setText("");
		
		Composite composite_1 = new Composite(shell, SWT.NONE);
		composite_1.setBounds(10, 44, 414, 28);
		
		Label lblVentana = new Label(composite_1, SWT.NONE);
		lblVentana.setBounds(10, 0, 394, 25);
		lblVentana.setText("");
		
		Composite composite_2 = new Composite(shell, SWT.NONE);
		composite_2.setBounds(10, 78, 280, 173);
		
		Button btnBoton = new Button(composite_2, SWT.NONE);
		btnBoton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnBoton.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnBoton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				
				lblVentana.setText(lblVentana.getText() + "1");
			}
		});
		btnBoton.setBounds(10, 105, 75, 25);
		btnBoton.setText("1");
		
		Button btnBoton_1 = new Button(composite_2, SWT.NONE);
		btnBoton_1.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnBoton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnBoton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblVentana.setText(lblVentana.getText() + "3");
			}
		});
		btnBoton_1.setBounds(195, 105, 75, 25);
		btnBoton_1.setText("3");
		
		Button btnBoton_2 = new Button(composite_2, SWT.NONE);
		btnBoton_2.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnBoton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblVentana.setText(lblVentana.getText() + "2");
			}
		});
		btnBoton_2.setBounds(102, 105, 75, 25);
		btnBoton_2.setText("2");
		
		Button btnBoton_3 = new Button(composite_2, SWT.NONE);
		btnBoton_3.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnBoton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblVentana.setText(lblVentana.getText() + "7");
			}
		});
		btnBoton_3.setBounds(10, 10, 75, 25);
		btnBoton_3.setText(" 7");
		
		Button btnBoton_4 = new Button(composite_2, SWT.NONE);
		btnBoton_4.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnBoton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblVentana.setText(lblVentana.getText() + "8");
			}
		});
		btnBoton_4.setBounds(102, 10, 75, 25);
		btnBoton_4.setText("8");
		
		Button btnBoton_5 = new Button(composite_2, SWT.NONE);
		btnBoton_5.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnBoton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblVentana.setText(lblVentana.getText() + "9");
			}
		});
		btnBoton_5.setBounds(195, 10, 75, 25);
		btnBoton_5.setText("9");
		
		Button btnBoton_6 = new Button(composite_2, SWT.NONE);
		btnBoton_6.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnBoton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblVentana.setText(lblVentana.getText() + "4");
			}
		});
		btnBoton_6.setBounds(10, 58, 75, 25);
		btnBoton_6.setText(" 4");
		
		Button btnBoton_7 = new Button(composite_2, SWT.NONE);
		btnBoton_7.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnBoton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblVentana.setText(lblVentana.getText() + "5");
			}
		});
		btnBoton_7.setBounds(102, 58, 75, 25);
		btnBoton_7.setText("5");
		
		Button btnBoton_8 = new Button(composite_2, SWT.NONE);
		btnBoton_8.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnBoton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblVentana.setText(lblVentana.getText() + "6");
			}
		});
		btnBoton_8.setBounds(195, 58, 75, 25);
		btnBoton_8.setText("6");
		
		Button btnBoton_9 = new Button(composite_2, SWT.NONE);
		btnBoton_9.setFont(SWTResourceManager.getFont("Segoe UI", 14, SWT.NORMAL));
		btnBoton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblVentana.setText(lblVentana.getText() + "0");
			}
		});
		btnBoton_9.setBounds(10, 138, 260, 25);
		btnBoton_9.setText("Numero 0");
		
		Composite composite_3 = new Composite(shell, SWT.NONE);
		composite_3.setBounds(296, 78, 128, 173);
		
		Button btnSuma = new Button(composite_3, SWT.NONE);
		btnSuma.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnSuma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(lblVentana.getText().length()!= 0 || lblVentanados.getText().length()!= 0) {
								
					if(lblVentanados.getText().length()== 0) {
						lblVentanados.setText(lblVentana.getText() + " + ");
						lblVentana.setText("");
					}
					else if(lblVentanados.getText().contains("*")|| lblVentanados.getText().contains("+") || lblVentanados.getText().contains("/")){
					
						lblVentanados.setText(lblVentanados.getText().replace("*", "+"));
						lblVentanados.setText(lblVentanados.getText().replace("/", "+"));
					}
					else if(lblVentanados.getText().contains("-")) {
						String texto = lblVentanados.getText();
						if(texto.charAt(texto.length()-2)=='-') {
							
							lblVentanados.setText(lblVentanados.getText().replace("-", "+"));
						}
						
					}
					else {
						lblVentanados.setText(lblVentanados.getText() + " + ");
					}
				
				
				}else {
					System.out.println("Introducir primero un valor");
				}
				
			}
		});
		btnSuma.setBounds(10, 41, 108, 25);
		btnSuma.setText("Suma");
		
		Button btnResta = new Button(composite_3, SWT.NONE);
		btnResta.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnResta.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(lblVentana.getText().length()!= 0 || lblVentanados.getText().length()!= 0) {
					if(lblVentanados.getText().length()== 0) {
						lblVentanados.setText(lblVentana.getText() + " - ");
						lblVentana.setText("");
					}
					else if(lblVentanados.getText().contains("+") || lblVentanados.getText().contains("*") || lblVentanados.getText().contains("/")){
						lblVentanados.setText(lblVentanados.getText().replace("+", "-"));
						lblVentanados.setText(lblVentanados.getText().replace("*", "-"));
						lblVentanados.setText(lblVentanados.getText().replace("/", "-"));
					}
					else if(lblVentanados.getText().contains("-")) {
						String texto = lblVentanados.getText();
						if(texto.charAt(texto.length()-2)=='-') {
							
							System.out.println("ya es menor");
						}
						
					}else {
						lblVentanados.setText(lblVentanados.getText() + " - ");
					}
				}else {
					System.out.println("Introducir primero un valor");
				}
				
				
			}
		});
		btnResta.setBounds(10, 72, 108, 25);
		btnResta.setText("Resta");
		
		Button btnMultiplicacion = new Button(composite_3, SWT.NONE);
		btnMultiplicacion.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnMultiplicacion.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(lblVentana.getText().length()!= 0 || lblVentanados.getText().length()!= 0) {
					if(lblVentanados.getText().length()== 0) {
						lblVentanados.setText(lblVentana.getText() + " * ");
						lblVentana.setText("");
					}
					else if(lblVentanados.getText().contains("+") || lblVentanados.getText().contains("/") || lblVentanados.getText().contains("*")){
						lblVentanados.setText(lblVentanados.getText().replace("+", "*"));
						lblVentanados.setText(lblVentanados.getText().replace("/", "*"));
					}else if(lblVentanados.getText().contains("-")) {
						String texto = lblVentanados.getText();
						if(texto.charAt(texto.length()-2)=='-') {
							
							lblVentanados.setText(lblVentanados.getText().replace("-", "*"));
						}
						
					}else {
						lblVentanados.setText(lblVentanados.getText() + " * ");
					}
				
				}
				else {
					System.out.println("Introducir primero un valor");
				}
			}
		});
		btnMultiplicacion.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnMultiplicacion.setBounds(10, 103, 108, 25);
		btnMultiplicacion.setText("Multiplicaci\u00F3n");
		
		Button btnDivision = new Button(composite_3, SWT.NONE);
		btnDivision.setFont(SWTResourceManager.getFont("Segoe UI", 12, SWT.NORMAL));
		btnDivision.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				if(lblVentana.getText().length()!= 0 || lblVentanados.getText().length()!= 0) {
					if(lblVentanados.getText().length()== 0) {
						lblVentanados.setText(lblVentana.getText() + " / ");
						lblVentana.setText("");
					}
					else if(lblVentanados.getText().contains("+") || lblVentanados.getText().contains("*") || lblVentanados.getText().contains("/")){
						lblVentanados.setText(lblVentanados.getText().replace("+", "/"));
						lblVentanados.setText(lblVentanados.getText().replace("*", "/"));
						
					}else if(lblVentanados.getText().contains("-")) {
						String texto = lblVentanados.getText();
						if(texto.charAt(texto.length()-2)=='-') {
							
							lblVentanados.setText(lblVentanados.getText().replace("-", "+"));
						}
						
					}else {
						lblVentanados.setText(lblVentanados.getText() + " / ");
					}
				
				}else {
					System.out.println("Introducir primero un valor");
				}
				
			}
		});
		btnDivision.setBounds(10, 134, 108, 25);
		btnDivision.setText("Divisi\u00F3n");
		
		Button btnLimpar = new Button(composite_3, SWT.NONE);
		btnLimpar.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		btnLimpar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				lblVentana.setText("");
				lblVentanados.setText("");
			}
		});
		btnLimpar.setBounds(10, 10, 32, 25);
		btnLimpar.setText("C");
		
		Button btnTotal = new Button(composite_3, SWT.NONE);
		btnTotal.setFont(SWTResourceManager.getFont("Segoe UI", 13, SWT.NORMAL));
		btnTotal.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
				String texto = lblVentanados.getText();
				if((lblVentana.getText().length()!= 0 && lblVentanados.getText().length()!= 0)
					&&
					(lblVentanados.getText().contains("+")
					|| lblVentanados.getText().contains("*")
					|| lblVentanados.getText().contains("/")
					|| (texto.charAt(texto.length()-2)=='-'))) {					
						lblVentanados.setText(lblVentanados.getText() + lblVentana.getText());
						lblVentana.setText("");
						String operador = lblVentanados.getText();
						int num = 0;
						int num2 = 0;
						int resultado = 0;
						char signo = ' ';
						signo = operador.charAt(operador.indexOf(" ") +1);
						num = Integer.parseInt(operador.substring(0, (operador.indexOf(" ") )));
						num2 = Integer.parseInt(operador.substring((operador.lastIndexOf(" ")+1), operador.length()));
						String res = "";
						if(signo == '+') {
							resultado = num + num2;
							res += resultado;
							lblVentanados.setText(res);
						}else if(signo == '-') {
						
							resultado = num - num2;
							res += resultado;
							lblVentanados.setText(res);
						}else if(signo == '*') {
							resultado = num * num2;
							res += resultado;
							lblVentanados.setText(res);
						}else if(signo == '/' && num2 != 0) {
							resultado = num / num2;
							res += resultado;
							lblVentanados.setText(res);
						}else if(signo == '/' && num2 == 0) {
							System.out.println("No se puede dividir entre 0");
							lblVentana.setText("");
							lblVentanados.setText("");
							
						}
						if(lblVentanados.getText().length()==0) {
							System.out.println("No hay valores");
						}
					}else {
						System.out.println("Introduzca primero un valor");
				}
			}
		});
		btnTotal.setBounds(43, 10, 75, 25);
		btnTotal.setText("Total");

		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
}
