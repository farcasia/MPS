package postingrules;

/*Generated by MPS */


public interface Subject {
  void addEntry(Entry arg, AccountType type);
  Subject getAdjuster();
  void reverseEntry(Entry arg);
  void process(AccountingEvent e);
}
