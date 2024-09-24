SOFTWARE DESIGN AND ARCHITECTURE

GRASP

Pattern Name -> Protected Variation:
	What I understand about Protected Variations is a design principle that helps us create software systems that are flexible and easy to change. It's like building a LEGO set where you can swap out individual pieces without affecting the whole structure.


How does it Work?
1.	Identify the Parts That Might Change: Identify the parts of your software that might change or have different variations.
2.	Create a "Blueprint": Create a blueprint for that part of your software. This blueprint could be an interface or an abstract class.
3.	Use the Blueprint: Upon reading this point, a common question arises: How can we utilize this blueprint? The answer is simple: Whenever you need to add a new variant to your software, simply implement that interface in the new variant.

Why is it Useful?
Protected Variations makes your software:
•	Flexible: It's easier to add new features or change existing ones.
•	Maintainable: It's easier to fix bugs and make improvements.
•	Reliable: It's less likely to break when changes are made.


==============WHAT IS IN THIS CODE===========================

This code demonstrates the **Protected Variations** principle using notifications. The `NotificationSender` interface defines a method `sendNotification()` to send messages. Three classes (`EmailNotification`, `SMSNotification`, and `PushNotification`) implement this interface, each sending notifications via email, SMS, or push notifications.

The `AlertSystem` class uses a `NotificationSender` to send alerts. By passing different notification implementations (email, SMS, or push), the system can send alerts in various ways without changing the `AlertSystem` class itself.

In the `main` method, alerts are sent using email, SMS, and push notifications.
