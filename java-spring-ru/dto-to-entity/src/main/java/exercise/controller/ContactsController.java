package exercise.controller;

import exercise.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import exercise.model.Contact;
import exercise.repository.ContactRepository;
import exercise.dto.ContactDTO;
import exercise.dto.ContactCreateDTO;

@RestController
@RequestMapping("/contacts")
public class ContactsController {

    @Autowired
    private ContactRepository contactRepository;

    // BEGIN
    @PostMapping(path = "")
    @ResponseStatus(HttpStatus.CREATED)
    public ContactDTO create(@RequestBody ContactCreateDTO contactData) {
        var contact = toEntity(contactData);
        contactRepository.save(contact);
        var contactDto = toDTO(contact);
        return contactDto;
    }

    private Contact toEntity(ContactCreateDTO contactDto) {
        var contact = new Contact();
        contact.setFirstName(contactDto.getFirstName());
        contact.setLastName(contactDto.getLastName());
        contact.setPhone(contactDto.getPhone());
        return contact;
    }

    private ContactDTO toDTO(Contact contact) {
        var dto = new ContactDTO();
        dto.setId(contact.getId());
        dto.setFirstName(contact.getFirstName());
        dto.setLastName(contact.getLastName());
        dto.setPhone(contact.getPhone());
        dto.setCreatedAt(contact.getCreatedAt());
        dto.setUpdatedAt(contact.getUpdatedAt());
        return dto;
    }
//    @PostMapping(path = "")
//    @ResponseStatus(HttpStatus.CREATED)
//    public ContactDTO create(@RequestBody ContactCreateDTO contactData) {
////    @PutMapping(path = "/{id}")
////    public ContactDTO update(@PathVariable long id, @RequestBody ContactCreateDTO contactData) {
////
////        var task =  contactRepository.findById(id)
////                .orElseThrow(() -> new ResourceNotFoundException("Task with id " + id + " not found"));
//
////        task.setTitle(taskData.getTitle());
////        task.setDescription(taskData.getDescription());
//
////        contactRepository.save(task);
////
////        return task;
//
//        var post = toEntity(contactData); // Сначала в Entity
//        contactRepository.save(post);
//        var contactDTO = toDTO(post); // Потом в DTO
//        return contactDTO;
//    }
//
//    private ContactDTO toDTO(Contact contact) {
//        var dto = new ContactDTO();
//        dto.setId(contact.getId());
//        dto.setFirstName(contact.getFirstName());
//        dto.setLastName(contact.getLastName());
//        dto.setPhone(contact.getPhone());
//        dto.setCreatedAt(contact.getCreatedAt());
//        dto.setCreatedAt(contact.getUpdatedAt());
//        return dto;
//    }
//
//    private Contact toEntity(ContactCreateDTO contactDto) {
//        var contact = new Contact();
//        contact.setFirstName(contactDto.getFirstName());
//        contact.setLastName(contactDto.getLastName());
//        contact.setPhone(contactDto.getPhone());
//        return contact;
//    }
    // END
}
