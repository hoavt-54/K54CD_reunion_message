package vnu.uet.k54cd;
import  vnu.uet.studentdata.*;
private class K54cdReunionNotification{
	private static final OUR_CLASS_NAME = "K54CD";
	private static final THIS_MAIN_MESSAGE_CONTENT = "Mong các bạn cố gắng tranh thủ về quê hay " +
										+ "giải quyết các vấn đề cá nhân trong cuối tuần này, " + 
										+ "để tuần sau họp lớp được đông đủ";
	private static final K54CD_REUNION_DATE = "tối ngày 30/1 (tối thứ 6).";
	public static K54CD_REUNION_VENUE = "undefined_yet";
	
	public static void main (String args []) {
		List<K54cdMember> aceK54cders;
		aceK54cders = K54cdClass.getMembers();
		StringBuilder messageBuilder = new StringBuilder();
		messageBuilder.append("Thông báo liên quan đến vụ họp lớp và <u>bữa tất niên</u> của lớp " + OUR_CLASS_NAME );
		K54cdMember binhpt_54 = aceK54cders.get(aceK54cders
								.indexOf(new K54cdMember("Binh Pham Thanh")));
		K54cdMember hienpt_54 = aceK54cders.get(aceK54cders
								.indexOf(new K54cdMember("Hien Bui The")));
		messageBuilder.append("Như lớp trưởng " + binhpt_54.getName() + " and bạn " + hienpt_54.getName() + " đã thông báo");
		messageBuilder.append("và cũng là theo nguyện vọng của đa số thành viên trong lớp,";
		messageBuilder.append("chúng ta sẽ có một bữa tất tiên chém gió vào tuần sau: ").append(K54CD_REUNION_DATE);
		messageBuilder.append("Cũng đã gần 2 năm không gặp, lại năm hết tết đến,")
							.append("nhiều bạn đã thành công có việc làm ổn định")
							.append("là nhân viên các tập đoàn lớp nhất nhì Hà Nội.")
							.append("có những bạn đã gia đình yên ấm")
							.append("có những bạn may mắn được ra nước ngoài học tập")
							.append("có bạn lại chọn phiêu bạt đến những vùng đất mới, kiếm tìm những cơ hội mới")
							.append("có những bạn đang ấp ủ những giác mơ lớn lao và đang cháy hết mình vì nó")
							.append("Có những bạn vẫn đang đi tìm cho mình một ước mơ, một đam mê thực sự")
							.append("hay có bạn vẫn đang ngày đêm đau đáu một câu hỏi rằng tại sao, tại sao")
							.append("\"Tại sao code của mình nó lại *** chạy\"")
							.append("Hay có những bạn lại không thể trả lời được câu hỏi tiêu gì cho hết bây h :((( lương cntt cao như thế này :(((")
							.append("Nhưng dù bạn là ai, đang làm gì và ở đâu,");
							.append("code C#, java, python, R, php hay C++,"
							.append("dù có gấu hay chưa có gấu, sắp có gấu hoặc có thể còn lâu mới có gấu (t rất tiếc)")
							.append("thì những năm tháng sinh viên, những người bạn hay những kỉ niệm 4 năm ở lớp K54CD")
							.append("sẽ mãi là những điều tuyệt vời.")
							.append("Hẹn gặp lại các bạn")
		messageBuilder.append(THIS_MAIN_MESSAGE_CONTENT);
		messageBuilder.append("\n\n\t\t\t\t\t\t\t\t\t Hoa Vu Trong");
		return;
	}
}
