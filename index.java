// دالة لإظهار القسم المحدد وإخفاء الآخرين
function showSection(sectionId) {
    // إخفاء جميع الأقسام
    const sections = document.querySelectorAll('.section');
    sections.forEach(section => {
        section.classList.remove('active');
    });
    
    // إظهار القسم المحدد
    const targetSection = document.getElementById(sectionId);
    if (targetSection) {
        targetSection.classList.add('active');
    }
}

// عند تحميل الصفحة، أظهر القسم الأول افتراضياً
document.addEventListener('DOMContentLoaded', function() {
    showSection('cybersecurity');
});
