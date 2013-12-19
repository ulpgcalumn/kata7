package kata7;

public class CalculateCommand extends Command {

    private MoneyDialog moneyDialog;
    private CurrencyDialog currencyDialog;

    public CalculateCommand(MoneyDialog moneyDialog, CurrencyDialog currencyDialog) {
        this.moneyDialog = moneyDialog;
        this.currencyDialog = currencyDialog;
    }

    @Override
    public void execute() {
        System.out.print(moneyDialog.getMoney() + " " + currencyDialog.getCurrency());
    }

    
    
    
}
