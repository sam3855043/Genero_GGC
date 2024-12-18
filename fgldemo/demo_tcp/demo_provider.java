/*
 * Generated using Genero Ghost Client 5.00.02-202405230916
 */
package demo_tcp;

import com.fourjs.ggc.ScenarioProvider;
import com.fourjs.ggc.Scenario;
import com.fourjs.ggc.Client;
import com.fourjs.ggc.generator.ScenarioChecks;
import java.util.concurrent.ConcurrentLinkedDeque;
import com.fourjs.ggc.DependencyHandler;

public class demo_provider implements ScenarioProvider
{
  private final ConcurrentLinkedDeque<Scenario> scenarios;
  DependencyHandler dh = null;

  /*  */
  /* Instance initializer */
  public demo_provider()
  {
    scenarios = new ConcurrentLinkedDeque<>();

    /* Register scenario functions */
    scenarios.add(new scenario_0());
    scenarios.add(new scenario_1());

  }

  /* Scenario demo id: 0 */
  private class scenario_0 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.setTableSize("s_topics", 15);

      client.setTableSize("s_demos", 15);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(539);
      client.setTableSize("s_topics", 12);

      client.setTableSize("s_demos", 12);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(55);
      client.setTableSize("s_topics", 13);

      client.setTableSize("s_demos", 13);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(197);
      client.mediaSize("large");

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(3678);
      client.setFocus("s_demos", 3);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(186);
      client.action("s_demos.show"); /* s_demos double click */

      ScenarioChecks.checkFormName(client, "demodisp");
      ScenarioChecks.checkFormTitle(client, "demodisp");
      client.wait(1423);
      client.action("accept"); /* OK */

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(751);
      client.setFocus("s_demos", 5);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(189);
      client.action("s_demos.show"); /* s_demos double click */

      ScenarioChecks.checkFormName(client, "demodisp");
      ScenarioChecks.checkFormTitle(client, "demodisp");
      client.wait(1223);
      client.action("accept"); /* OK */

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(2652);
      client.setFocus("s_demos", 0);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(171);
      client.action("s_demos.show"); /* s_demos double click */

      ScenarioChecks.checkFormName(client, "demodisp");
      ScenarioChecks.checkFormTitle(client, "demodisp");
      client.wait(1380);
      client.action("accept"); /* OK */

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(1194);
      client.expandTree("s_topics", 1);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(2089);
      client.setTableOffset("s_topics", 2);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(128);
      client.setTableOffset("s_topics", 3);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(1060);
      client.expandTree("s_topics", 11);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(671);
      client.setFocus("s_topics", 15);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(945);
      client.setFocus("s_demos", 0);

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(164);
      client.action("s_demos.show"); /* s_demos double click */

      ScenarioChecks.checkFormName(client, "demo");
      ScenarioChecks.checkFormTitle(client, "Demos");
      client.wait(3384);
      client.action("cancel"); /* Cancel */

    }
  }
  /* Scenario demo id: 1 */
  private class scenario_1 implements Scenario
  {
    @Override
    public void play(Client client)
    {
      ScenarioChecks.checkFormName(client, "fgl_dialog_setBuffer");
      ScenarioChecks.checkFormTitle(client, "fgl_dialog_SetBuffer");
      client.action("close"); /* Close */

    }
  }

  @Override
  public Scenario nextScenario()
  {
    return scenarios.removeFirst();
  }
}
