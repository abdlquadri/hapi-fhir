package ca.uhn.fhir.jpa.term;

import ca.uhn.fhir.jpa.config.TestR4ConfigWithElasticHSearch;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * This class runs all parent class tests using Elasticsearch configuration
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = TestR4ConfigWithElasticHSearch.class)
public class ValueSetHSearchExpansionR4ElasticIT extends AbstractValueSetHSearchExpansionR4Test {

}
