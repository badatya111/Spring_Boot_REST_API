/**
 * @author Abani Kumar
 * Created on 1/15/2024
 * Time 4:56 PM
 * Project Name springboot-mongodb-main
 */

package com.api.springbootmongodb.collection;

import lombok.Builder;
import lombok.Data;

/**
 * @author Abani Kumar
 * Created on 1/15/2024
 * Time 4:56 PM
 * Project Name springboot-mongodb-main
 */
@Data
@Builder
public class Languages {

    private String primaryLanguage;
    private String secondaryLanguage;
    private String thirdLanguage;

}
