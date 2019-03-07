package builderpackage;

public class Employee 
{
   private String lastName;
   private String middleName;
   private String firstName;
   private long id;
   private int birthYear;
   private int birthMonth;
   private int birthDate;
   private int hireYear;
   private int hireMonth;
   private int hireDate;

   public Employee(
      final String newLastName,
      final String newMiddleName,
      final String newFirstName,
      final long newId,
      final int newBirthYear,
      final int newBirthMonth,
      final int newBirthDate,
      final int newHireYear,
      final int newHireMonth,
      final int newHireDate)
   {
      this.lastName = newLastName;
      this.middleName = newMiddleName;
      this.firstName = newFirstName;
      this.id = newId;
      this.birthYear = newBirthYear;
      this.birthMonth = newBirthMonth;
      this.birthDate = newBirthDate;
      this.hireYear = newHireYear;
      this.hireMonth = newHireMonth;
      this.hireDate = newHireDate;
   }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(int birthMonth) {
        this.birthMonth = birthMonth;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(int birthDate) {
        this.birthDate = birthDate;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public int getHireMonth() {
        return hireMonth;
    }

    public void setHireMonth(int hireMonth) {
        this.hireMonth = hireMonth;
    }

    public int getHireDate() {
        return hireDate;
    }

    public void setHireDate(int hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" + "lastName=" + lastName + ", middleName=" + middleName + ", firstName=" + firstName + ", id=" + id + ", birthYear=" + birthYear + ", birthMonth=" + birthMonth + ", birthDate=" + birthDate + ", hireYear=" + hireYear + ", hireMonth=" + hireMonth + ", hireDate=" + hireDate + '}';
    }
   
   
}