public class Kalkylator {
public String operator;
public boolean newEntry = false;

public void onAdd() {
calculation("+");
}
public void onSubtract() {
calculation("-");
}
public void onMultiply() {
calculation("*");
}
public void onDivide() {
calculation("/");
}

private void calculation(String x) {
	operator = x;
	newEntry = true;
	updateDisplay();
}
public void updateDisplay() {
// Hypotetisk kod
}
public Object Add(int i, int j) {
	return null;
}
}