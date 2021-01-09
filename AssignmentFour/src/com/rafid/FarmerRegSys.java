package com.rafid;

import self.created.exceptions.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;

public class FarmerRegSys {
    private String firstName;
    private String lastName;
    private String[] dateOfBirth = new String[3];
    private String aboveAge18 = "0";
    private String belowAge18 = "0";
    private String avgPerIncome;
    private String avgFamilyIncome;
    private String avgFamilyExpense;
    private String avgFarmingExpense;
    private String ifNeedHelp;
    private String wishStipendAmount;
    private String fertilizerNeeds;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) throws NumericNotAllowedException {
        if (ifAnyNumericDigit(firstName) == true) { //Any numeric character will not be accepted for First Name fields.
            throw new NumericNotAllowedException("numeric values are not allowed for First Name field, try again. thank you"); //will throw the custom build exception NumericNotAllowedException
        } else {
            this.firstName = firstName;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws NumericNotAllowedException {
        if (ifAnyNumericDigit(lastName) == true) { //Any numeric character will not be accepted for Last Name fields.
            throw new NumericNotAllowedException("numeric values are not allowed for Last Name field, try again. thank you");
        } else {
            this.lastName = lastName;
        }

    }

    public String[] getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String[] dateOfBirth) throws OverEighteenException {
        LocalDate today = LocalDate.now();       //Today's date
        //Birth date
        LocalDate birthday = LocalDate.of(Integer.parseInt(dateOfBirth[2]), Integer.parseInt(dateOfBirth[1]), Integer.parseInt(dateOfBirth[0]));

        //getting the age by using between
        Period p = Period.between(birthday, today);

        int age = p.getYears();
        //checking if age is minimum of 18 or not
        if (age < 18) {
            throw new OverEighteenException();
        } else {
            this.dateOfBirth = dateOfBirth;
        }

    }

    public String getAboveAge18() {
        return aboveAge18;
    }

    public void setAboveAge18(String aboveAge18) throws FamilyMembersOverloadException {
        if (Integer.parseInt(aboveAge18) + Integer.parseInt(this.belowAge18) > 15) { //Number of family members is not expected to be more than 15
            throw new FamilyMembersOverloadException();
        } else {
            this.aboveAge18 = aboveAge18;
        }
    }

    public String getBelowAge18() {
        return belowAge18;
    }

    public void setBelowAge18(String belowAge18) throws FamilyMembersOverloadException {
        if (Integer.parseInt(this.aboveAge18) + Integer.parseInt(belowAge18) > 15) { //Number of family members is not expected to be more than 15
            throw new FamilyMembersOverloadException();
        } else {
            this.belowAge18 = belowAge18;
        }
    }

    public String getAvgPerIncome() {
        return avgPerIncome;
    }

    public void setAvgPerIncome(String avgPerIncome) throws DigitOverloadedException, NonNumericNotAllowedException {
        //Average monthly personal income field will only accept numeric characters and
        //should not exceed 6 digits.
        if (ifAnyCharacterLetter(avgPerIncome) == true) {
            throw new NonNumericNotAllowedException();
        }
        if (digitCount(avgPerIncome) > 6) {
            throw new DigitOverloadedException("digits can't exceed 6 digits");
        }
        this.avgPerIncome = avgPerIncome;
    }

    public String getAvgFamilyIncome() {
        return avgFamilyIncome;
    }

    public void setAvgFamilyIncome(String avgFamilyIncome) throws DigitOverloadedException, NonNumericNotAllowedException {
//        Average monthly family income field will only accept numeric characters and
//        should not exceed 6 digits.
        if (ifAnyCharacterLetter(avgFamilyIncome) == true) {
            throw new NonNumericNotAllowedException();
        }
        if (digitCount(avgFamilyIncome) > 6) {
            throw new DigitOverloadedException("digits can't exceed 6 digits");
        }
        this.avgFamilyIncome = avgFamilyIncome;
    }


    public String getAvgFamilyExpense() {
        return avgFamilyExpense;
    }

    public void setAvgFamilyExpense(String avgFamilyExpense) throws DigitOverloadedException, NonNumericNotAllowedException, ExpenseLimitException {
//        Average monthly family expense field will only accept numeric characters and
//        should not exceed 6 digits.
//        Average family expense should not be 25% more than the family income.
        if (ifAnyCharacterLetter(avgFamilyExpense) == true) {
            throw new NonNumericNotAllowedException();
        }
        if (digitCount(avgFamilyExpense) > 6) {
            throw new DigitOverloadedException("digits can't exceed 6 digits");
        }
        if (Integer.parseInt(avgFamilyExpense) > (int) (Double.parseDouble(this.avgFamilyIncome) * 1.25)) {
            throw new ExpenseLimitException("Average family expense should not be 25% more than the family income.");
        }
        this.avgFamilyExpense = avgFamilyExpense;
    }

    public String getAvgFarmingExpense() {
        return avgFarmingExpense;
    }

    public void setAvgFarmingExpense(String avgFarmingExpense) throws DigitOverloadedException, NonNumericNotAllowedException, ExpenseLimitException {
//        Average family/farming expense should not be 25% more than the family income.
        if (ifAnyCharacterLetter(avgFarmingExpense) == true) {
            throw new NonNumericNotAllowedException();
        }
        if (digitCount(avgFarmingExpense) > 6) {
            throw new DigitOverloadedException("digits can't exceed 6 digits");
        }
        if (Integer.parseInt(avgFarmingExpense) > (int) (Double.parseDouble(this.avgFamilyIncome) * 1.25)) {
            throw new ExpenseLimitException("Average farming expense should not be 25% more than the family income.");
        }
        this.avgFarmingExpense = avgFarmingExpense;
    }

    public String getIfNeedHelp() {
        return ifNeedHelp;
    }

    public void setIfNeedHelp(String ifNeedHelp) throws BooleanNotFoundException {
//        If they need any help from the government should only receive Boolean values
        if (ifNeedHelp.equals("true") || ifNeedHelp.equals("false")) {
            this.ifNeedHelp = ifNeedHelp;
        } else {
            throw new BooleanNotFoundException();
        }

    }

    public String getWishStipendAmount() {
        return wishStipendAmount;
    }

    public void setWishStipendAmount(String wishStipendAmount) throws NonNumericNotAllowedException, ExpenseLimitException {
//        Amount of money they wish to have as stipend from the Govt. will only receive numeric characters and should not exceed 25% more than the average
//        family income.
        if (ifAnyCharacterLetter(wishStipendAmount) == true) {
            throw new NonNumericNotAllowedException();
        }
        if (Integer.parseInt(wishStipendAmount) > (int) (Double.parseDouble(this.avgFamilyIncome) * .25)) {
            throw new ExpenseLimitException("Amount of money they wish to have as stipend from the Govt. should not exceed 25% more than the average\n" +
                    "family income.");
        }
        this.wishStipendAmount = wishStipendAmount;
    }

    public String getFertilizerNeeds() {
        return fertilizerNeeds;
    }

    public void setFertilizerNeeds(String fertilizerNeeds) throws DigitOverloadedException, NonNumericNotAllowedException {
//        Input for monthly Fertilizers usage should not be more than two digits and will only receive integer
//        inputs.
        if (ifAnyCharacterLetter(fertilizerNeeds) == true) {
            throw new NonNumericNotAllowedException();
        }
        if (digitCount(fertilizerNeeds) > 2) {
            throw new DigitOverloadedException("digit should not be more than 2 in this field, try again");
        }
        this.fertilizerNeeds = fertilizerNeeds;
    }


    //methods for checking

    private boolean ifAnyNumericDigit(String str) { // this method will return true if there is any numeric value in the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57) {
                return true;
            }

        }
        return false;
    }

    private boolean ifAnyCharacterLetter(String str) { // this method will return true if there is any letter character in the string
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 48 && str.charAt(i) > 57) {
                return true;
            }

        }
        return false;
    }


    private int digitCount(String str) { //will count how many digits are in the string
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            count++;
        }
        return count;
    }

    @Override
    public String toString() { //toString method to print everything
        return "FarmerRegSys-->\n" +
                "firstName='" + firstName + '\'' +
                ",\nlastName='" + lastName + '\'' +
                ",\ndateOfBirth=" + Arrays.toString(dateOfBirth) +
                ",\naboveAge18='" + aboveAge18 + '\'' +
                ",\nbelowAge18='" + belowAge18 + '\'' +
                ",\navgPerIncome='" + avgPerIncome + '\'' +
                ",\navgFamilyIncome='" + avgFamilyIncome + '\'' +
                ",\navgFamilyExpense='" + avgFamilyExpense + '\'' +
                ",\navgFarmingExpense='" + avgFarmingExpense + '\'' +
                ",\nifNeedHelp='" + ifNeedHelp + '\'' +
                ",\nwishStipendAmount='" + wishStipendAmount + '\'' +
                ",\nfertilizerNeeds='" + fertilizerNeeds + '\'';
    }
}
