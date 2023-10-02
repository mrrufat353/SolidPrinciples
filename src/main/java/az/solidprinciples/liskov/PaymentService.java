package az.solidprinciples.liskov;

public interface PaymentService {

    void makePayment(CreditCardDto creditCardDto, Double amount);

}
