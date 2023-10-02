package az.solidprinciples.liskov;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {
    public void makePayment(CreditCardDto creditCardDto, Double amount) {
        changeCard(creditCardDto, amount);
        printReceipt(creditCardDto, amount);
    }

    private void changeCard(CreditCardDto creditCardDto, Double amount) {
        log.info("Changed Customer");
    }

    private void printReceipt(CreditCardDto creditCardDto, Double amount) {
        log.info("Print receipt...");
    }


}
