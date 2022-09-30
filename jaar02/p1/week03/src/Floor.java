import java.util.ArrayList;

public class Floor {
    private int level;
    private ArrayList<Row> rows;
    private final static int MAX_AMOUNT_OF_ROWS = 24;

    public Floor(int level) {
        this.level = level;
        this.rows = new ArrayList<Row>();
    }

    public void addRow(Row row){
        if(this.rows.size() == MAX_AMOUNT_OF_ROWS) return;

        rows.add(row);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public ArrayList<Row> getRows() {
        return rows;
    }

    public void setRows(ArrayList<Row> rows) {
        this.rows = rows;
    }
}
