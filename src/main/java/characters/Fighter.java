package characters;

import behaviours.IWeapon;

import java.util.ArrayList;

public abstract class Fighter extends Player {
    private ArrayList<IWeapon> weapons;
    private IWeapon selectedWeapon;

    public Fighter(int healthPoints, String name) {
        super(healthPoints, name);
        this.selectedWeapon = null;
        this.weapons = new ArrayList<>();
    }

    public void addWeapon(IWeapon _weapon){
        this.weapons.add(_weapon);
    }

    public void chooseWeapon(String _weaponName){
        if (this.selectedWeapon != null){
           this.weapons.add(this.selectedWeapon);
        }
        if (weapons.size()>0){
          for (IWeapon w : weapons) {
              if (w.getName() == _weaponName) {
                  this.selectedWeapon = w;
                  this.weapons.remove(w);
              }
          }
        }
    }

    public IWeapon getSelectedWeapon() {
        return this.selectedWeapon;
    }

    public ArrayList<IWeapon> getNumberOfWeapons() {
        return this.weapons;
    }
}
