/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KCK.Gra;
import KCK.Gra.Plansze.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author s384080
 */
public class szkielet extends JFrame 
{
    /*inicjalizacja okienka
     * zmienna kontrolująca gdzie jesteśmy
     * switch będzie inicjalizował obiekt planszy
     * walka
     */
    public szkielet() 
    {
        super("Gra Zamek"); 
        JPanel plansza = new plansza_podst();
        add(plansza); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }   
    public void wybor_planszy()
    {
        switch()
        {
            case:
            case:
            case:
            default:
                
        }
    }
}