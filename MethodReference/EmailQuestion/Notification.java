package MethodReference.EmailQuestion;

@FunctionalInterface
public interface Notification
{
    void send(String customerEmail);
}
