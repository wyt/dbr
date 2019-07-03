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
public class AutoRunInst implements Serializable {

  private static final long serialVersionUID = 6886570654656944049L;

  private String id;

  /** Automator执行结果编码. */
  private String rCode;

  /** Automator响应JOSN. */
  private String info;

  /** 记录生成时间(Automator开始执行时间). */
  private Calendar dateAdded;

  /** 记录更新时间(Automator执行结束时间). */
  private Calendar dateUpdated;

  private long timeout;

  private Sheet sheet;
}
