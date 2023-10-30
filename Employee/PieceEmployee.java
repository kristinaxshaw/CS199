// Kristina Shaw
// Lab 1 Lecture

package edu.monmouth.Employee;

public class PieceEmployee implements Employee {
    private int ratePerPiece;
    private int piecesMade;

    public PieceEmployee(int ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
        this.piecesMade = 0;
    }

    public void setPiecesMade(int piecesMade) {
        this.piecesMade = piecesMade;
    }

    @Override
    public int getMonthlyPay() {
        return ratePerPiece * piecesMade;
    }

    @Override
    public String toString() {
        return "PieceEmployee [Rate Per Piece: $" + ratePerPiece + ", Pieces Made: " + piecesMade + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PieceEmployee other = (PieceEmployee) obj;
        return ratePerPiece == other.ratePerPiece && piecesMade == other.piecesMade;
    }
    // test for equals method
    public static void main(String[] args) {
        PieceEmployee employee1 = new PieceEmployee(10);
        employee1.setPiecesMade(150);

        PieceEmployee employee2 = new PieceEmployee(10);
        employee2.setPiecesMade(150);

        System.out.println("Employee 1 Monthly Pay: $" + employee1.getMonthlyPay());
        System.out.println("Employee 2 Monthly Pay: $" + employee2.getMonthlyPay());

        System.out.println("Employee 1: " + employee1);
        System.out.println("Employee 2: " + employee2);

        System.out.println("Are Employee 1 and Employee 2 equal? " + employee1.equals(employee2));
    }
}