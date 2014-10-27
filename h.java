import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.beanutils.BeanUtils;

import com.icg.coresource.common.UserSession;
import com.icg.coresource.dataaccess.model.Customer;
import com.icg.coresource.dataaccess.model.Imprint;
import com.icg.coresource.dataaccess.model.OdsPublisher;
import com.icg.coresource.dataaccess.model.OdsValidIsbnPrefix;
import com.icg.coresource.dataaccess.model.Publisher;
import com.icg.coresource.processor.OdsPublisherProcessor;
import com.icg.coresource.processor.OdsValidIsbnPrefixProcessor;

public class AccountInformationAction extends BaseAction {

	/**
	 * 
	 */
	private final OdsPublisherProcessor odsPublisherProcessor = new OdsPublisherProcessor();
	}
	

	public void setDisplayEanPrefixes(Boolean displayEanPrefixes) {
		this.displayEanPrefixes = displayEanPrefixes;
	}

}

