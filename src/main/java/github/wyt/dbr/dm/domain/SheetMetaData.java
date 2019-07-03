package github.wyt.dbr.dm.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Calendar;

/**
 * Sheet元数据描述.
 *
 * @author wangyongtao
 * @date 2018/7/4
 */
@Setter
@Getter
public class SheetMetaData implements Serializable {

  private static final long serialVersionUID = 8259723377765389389L;

  private String id;

  private Calendar dateAdded;

  private Calendar dateUpdated;

  private String sheetMeta;
}
