package github.wyt.dbr.dm.domain;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Calendar;

/**
 * @author wangyongtao
 * @date 2018/5/9
 */
@Setter
@Getter
public class AppLog implements Serializable {

  private static final long serialVersionUID = 3012525374003731510L;

  private String id;

  /** 业务ID. */
  private String bizId;

  private String moudle;

  private String data;

  private Calendar dateAdded;

  private Calendar dateUpdated;

  private String status;
}
