/*
 * Generated using Genero Ghost Client 5.00.02-202405230916
 */
package gbc_azzi800;

import com.fourjs.ggc.ScenarioProvider;
import com.fourjs.ggc.Scenario;
import com.fourjs.ggc.Client;
import com.fourjs.ggc.generator.ScenarioChecks;
import java.util.concurrent.ConcurrentLinkedDeque;
import com.fourjs.ggc.DependencyHandler;

public class app_gwc_azzi800_open_provider implements ScenarioProvider
{
  private final ConcurrentLinkedDeque<Scenario> scenarios;
  DependencyHandler dh = null;

  /*  */
  /* Instance initializer */
  public app_gwc_azzi800_open_provider()
  {
    scenarios = new ConcurrentLinkedDeque<>();

    /* Register scenario functions */
    scenarios.add(new scenario_2());

  }

  /* Scenario app_gwc_azzi800_open id: 2 */
  private class scenario_2 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.setTableSize("s_queryplan", 21);

      client.setTableSize("s_relateapps", 15);

      client.setTableSize("s_browse", 38);

      ScenarioChecks.checkFormName(client, "azzi800.tmp");
      ScenarioChecks.checkFormTitle(client, "使用者資料設定作業(azzi800)      [鼎捷開發測試環境(正式區):topprd,99]      營運據點:台中國泰(DSCTC)");
      client.wait(2624);
      client.action("close"); /* close */

    }
  }

  @Override
  public Scenario nextScenario()
  {
    return scenarios.removeFirst();
  }
}
