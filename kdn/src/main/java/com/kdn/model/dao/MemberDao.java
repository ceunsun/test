package com.kdn.model.dao;

import com.kdn.model.domain.Member;

public interface MemberDao {
	public abstract Member search(String id);
}
