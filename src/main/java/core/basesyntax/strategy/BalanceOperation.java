package core.basesyntax.strategy;

import core.basesyntax.model.Transaction;
import core.basesyntax.storage.Storage;

public class BalanceOperation implements OperationHandler {
    @Override
    public void apply(Transaction transaction) {
        Storage.getStorage().put(transaction.getFruit()
                .getType(), transaction.getQuantity());
    }
}
