package LowLevelDesign.DesignVendingMachine.VendingStates;

import LowLevelDesign.DesignVendingMachine.Coin;
import LowLevelDesign.DesignVendingMachine.Item;
import LowLevelDesign.DesignVendingMachine.VendingMachine;

import java.util.ArrayList;
import java.util.List;

public abstract class State {

    public void clickOnInsertCoinButton(VendingMachine machine) throws Exception {
        throw new Exception("insert coin button can not clicked on Dispense state");
    }

    public void clickOnStartProductSelectionButton(VendingMachine machine) throws Exception {
        return;
    }

    public void insertCoin(VendingMachine machine , Coin coin) throws Exception {
        return;
    }

    public void chooseProduct(VendingMachine machine, int codeNumber) throws Exception {
        return;
    }

    public int getChange(int returnChangeMoney) throws Exception {
        return 0;
    }

    public Item dispenseProduct(VendingMachine machine, int codeNumber) throws Exception {
        return new Item();
    }

    public List<Coin> refundFullMoney(VendingMachine machine) throws Exception {
        return new ArrayList<Coin>();
    }

    public void updateInventory(VendingMachine machine, Item item, int codeNumber) throws Exception {
        return;
    }


}
