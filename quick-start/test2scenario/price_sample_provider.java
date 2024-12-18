/*
 * Generated using Genero Ghost Client 5.00.02-202405230916
 */
package test2scenario;

import com.fourjs.ggc.ScenarioProvider;
import com.fourjs.ggc.Scenario;
import com.fourjs.ggc.Client;
import com.fourjs.ggc.generator.ScenarioChecks;
import java.util.concurrent.ConcurrentLinkedDeque;
import com.fourjs.ggc.DependencyHandler;

public class price_sample_provider implements ScenarioProvider
{
  private final ConcurrentLinkedDeque<Scenario> scenarios;
  DependencyHandler dh = null;

  /*  */
  /* Instance initializer */
  public price_sample_provider()
  {
    scenarios = new ConcurrentLinkedDeque<>();

    /* Register scenario functions */
    scenarios.add(new scenario_0());

  }

  /* Scenario price_sample id: 0 */
  private class scenario_0 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      ScenarioChecks.checkFormName(client, "price");
      ScenarioChecks.checkFormTitle(client, "Product and prices");
      client.setTableSize("sr_prices", 7);

      ScenarioChecks.checkFormName(client, "price");
      ScenarioChecks.checkFormTitle(client, "Product and prices");
      client.wait(833);
      client.setFocus("sr_prices", 2);

      ScenarioChecks.checkFormName(client, "price");
      ScenarioChecks.checkFormTitle(client, "Product and prices");
      client.wait(137);
      client.action("sr_prices.edit"); /* sr_prices double click */

      ScenarioChecks.checkFormName(client, "edit_price");
      ScenarioChecks.checkFormTitle(client, "Edit product price");
      client.wait(1873);
      client.action("accept"); /* OK */

      ScenarioChecks.checkFormName(client, "price");
      ScenarioChecks.checkFormTitle(client, "Product and prices");
      client.wait(955);
      client.action("accept"); /* OK */

    }
  }

  @Override
  public Scenario nextScenario()
  {
    return scenarios.removeFirst();
  }
}
