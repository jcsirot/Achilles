package parser.entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import fr.doan.achilles.entity.type.WideMap;

/**
 * BeanWithJoinColumnAsWideRow
 * 
 * @author DuyHai DOAN
 * 
 */
@Table
public class BeanWithJoinColumnAsWideRow
{
	@Id
	private Long id;

	@JoinColumn(table = "my_wide_row_cf")
	private WideMap<Integer, String> wideRow;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public WideMap<Integer, String> getWideRow()
	{
		return wideRow;
	}

	public void setWideRow(WideMap<Integer, String> wideRow)
	{
		this.wideRow = wideRow;
	}
}