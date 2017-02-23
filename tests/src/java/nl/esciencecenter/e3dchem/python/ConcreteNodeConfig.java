package nl.esciencecenter.e3dchem.python;

import java.util.Set;

import org.knime.core.node.InvalidSettingsException;
import org.knime.core.node.NodeSettingsRO;
import org.knime.core.node.NodeSettingsWO;
import org.knime.core.node.workflow.FlowVariable;

/**
 * Concrete implementation of PythonWrapperNodeConfig so it's non-abstract methods can be tested.
 */
public class ConcreteNodeConfig extends PythonWrapperNodeConfig {

	@Override
    public void saveTo(NodeSettingsWO settings) {

    }

    @Override
    public void loadFrom(NodeSettingsRO settings) throws InvalidSettingsException {
    }

	@Override
	public Set<FlowVariable> getOptionsValues() {
		Set<FlowVariable> variables = super.getOptionsValues();
		variables.add(new FlowVariable("column_name", "column1"));
		return variables;
	}
}
