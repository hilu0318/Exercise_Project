package kr.hilu0318.utils;

public class Pagination {

	private int currentPage;		//현재 페이지(목록)
		
	private int numOfPage;			//한번에 보여줄 페이지 수(PGN)
	private int beginPage;			//시작 페이지 번호(PGN)
	private int endPage;			//끝 페이지 번호(PGN)
	private int prevPage;			//prev버튼 클릭 시 페이지(PNG)
	private int nextPage;			//next번튼 클릭 시 페이지(PNG)
	private boolean nextGroup;		//다음 페이지 그룹이 있는지(PGN)
	private boolean prevGroup;		//이전 페이지 그룹이 있는지(PGN)
	
	public Pagination(int currentPage, int numOfPage, int lineOfPage, int lastPage) {
		int lastGroup = lastPage % numOfPage > 0 ? lastPage/numOfPage + 1 : lastPage/numOfPage;
		
		this.currentPage = currentPage;
		if(lastPage < currentPage || currentPage < 1)
			this.currentPage = 1;
		
		this.numOfPage = numOfPage;
		
		this.beginPage = (this.currentPage - 1) / numOfPage * numOfPage + 1;
		this.endPage = this.beginPage + numOfPage - 1 > lastPage ? lastPage : this.beginPage + numOfPage - 1;
		this.nextPage = this.endPage + 1;
		this.prevPage = this.beginPage - numOfPage;
		
		int currentGroup = this.beginPage / numOfPage + 1;
		
		this.nextGroup = currentGroup < lastGroup ? true : false;
		this.prevGroup = currentGroup > 1 ? true : false;
		
	}
	
	public int getNumOfPage() { return this.numOfPage; }
	public int getCurrentPage() { return this.currentPage; }
	public int getBeginPage() { return this.beginPage; }
	public int getEndPage() { return this.endPage; }
	public int getPrevPage() { return this.prevPage; }
	public int getNextPage() { return this.nextPage; }
	public boolean getNextGroup() { return this.nextGroup; }
	public boolean getPrevGroup() { return this.prevGroup; }
	
	public String toString() {
		return "PageCal [numOfPage="+this.numOfPage+", currentPage="+this.currentPage+", beginPage="+this.beginPage+
				", endPage="+this.endPage+", nextGroup="+this.nextGroup+", prevGroup="+this.prevGroup+"]";
	}
}
