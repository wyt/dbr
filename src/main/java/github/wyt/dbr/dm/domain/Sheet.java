package github.wyt.dbr.dm.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * @author wangyongtao
 * @date 2018/5/9
 */
@Setter
@Getter
public class Sheet implements Serializable {

  private static final long serialVersionUID = -1841403576536030258L;

  /** feedbackq缺省值. */
  public static final String FEEDBACK_DEFAULT_VAL = "-1";

  private String id;

  private String dlinkConvertBillId;

  private String sheet;

  private Calendar dateAdded;

  private Calendar dateUpdated;

  private List<AutoRunInst> autoRunInsts = new ArrayList<AutoRunInst>();

  private SheetMetaData sheetMetaData;

  /** serviceId，不唯一 */
  private String serviceId;

  /** dataId，不唯一 */
  private String dataId;

  /** 默认为-1 push执行结果的反馈数据，返回值一般为0,1 如果网络有问题时，此字段会更新为null */
  private String feedback = FEEDBACK_DEFAULT_VAL;
}
