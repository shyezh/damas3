package Damas;

import javafx.scene.Group;
import javafx.scene.text.Font;

/**
 *
 * @author weily
 */
public class MovimientoA extends Main implements Comparable{

    public int MovimientoA = 0;

    public MovimientoA(int MovimientoA) {
        this.MovimientoA = MovimientoA;
    }
    public int getMoviminetos() {
        return MovimientoA;
    }

    public void setMoviminetos(int MovimientoA) {
        this.MovimientoA = MovimientoA;
    }

    public Tablero[][] getTabla() {
        return Tabla;
    }

    public void setTabla(Tablero[][] Tabla) {
        this.Tabla = Tabla;
    }

    public Group getTableroGroup() {
        return TableroGroup;
    }

    public void setTableroGroup(Group TableroGroup) {
        this.TableroGroup = TableroGroup;
    }

    public Group getPiezaGroup() {
        return PiezaGroup;
    }

    public void setPiezaGroup(Group PiezaGroup) {
        this.PiezaGroup = PiezaGroup;
    }

    public static Font getFont() {
        return font;
    }

    public static void setFont(Font font) {
        Main.font = font;
    }

    public CajaMenu getMenu() {
        return menu;
    }

    public void setMenu(CajaMenu menu) {
        this.menu = menu;
    }
    

    public int compareTo(Object o) {
        int resultado = 0;
        
        if(this.MovimientoA < ((MovimientoA)o).MovimientoA){
           resultado =  resultado + 1;
           System.out.println(" movimientoA resultado " + MovimientoA);
        }
        return resultado+1;
    }
    
}
