package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class StepCalcs {

    public static DataTable data;

    @Given("^following parameters:$")
    public void data(List<List<String>> dTable) throws InterruptedException, Exception {
        data = DataTable.create(dTable);
        System.out.println("All Cells Data: " + data.cells());

    }

    @Then("^Calculate totals")
    public void calculateTotals() throws InterruptedException, Exception {
        int i = data.cells().size();
        for (int j = 1; j < i; j++) {
            for (int k = 0; k < i ; k++) {
                String value = data.cell(j,k);
                if (value.equals("OBL-MODER")){
                    double nominal = Double.parseDouble(data.cell(j,2));
                    double precio = Double.parseDouble(data.cell(j,3));
                    System.out.println("Precios OBL-MODER: " + (nominal*precio));
                }
                if (value.equals("OBL-RIESGO")){
                    double nominal = Double.parseDouble(data.cell(j,2));
                    double precio = Double.parseDouble(data.cell(j,3));
                    System.out.println("Precios OBL-RIESGO: " + ((nominal*precio)+2000));
                }

            }

        }

    }

}
